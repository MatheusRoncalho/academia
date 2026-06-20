package com.roncalho.academia.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Acompanhamento extends AbstractAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @ManyToOne(optional = false)
    @JoinColumn(name = "profissional_id", nullable = false)
    private Profissional profissional;

    @ManyToOne(optional = false)
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;

    @Column(name = "data_atendimento", nullable = false)
    private LocalDate dataAtendimento;

    @Lob
    private String observacoes;

    @Column(name = "proximo_retorno")
    private LocalDate proximoRetorno;

    @PrePersist
    @PreUpdate
    private void validate() {
        if (proximoRetorno != null && dataAtendimento != null && proximoRetorno.isBefore(dataAtendimento)) {
            throw new IllegalArgumentException("proximo_retorno precisa ser null or >= data_atendimento");
        }
    }

}

