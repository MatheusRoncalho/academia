package com.roncalho.academia.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

import com.roncalho.academia.enums.AlunoStatus;
import jakarta.persistence.PrePersist;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aluno extends AbstractAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Column(length = 100)
    private String telefone;

    @Column(length = 100)
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private AlunoStatus status = AlunoStatus.ATIVO;

    @PrePersist
    private void prePersist() {
        if (this.dataCadastro == null) {
            this.dataCadastro = LocalDate.now();
        }
        if (this.status == null) {
            this.status = AlunoStatus.ATIVO;
        }
    }

}
