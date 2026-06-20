package com.roncalho.academia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profissional extends AbstractAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 14, unique = true)
    private String cpf;

    @Column(length = 20)
    private String telefone;

    @Column(length = 100)
    private String email;

    @Column(name = "registro_profissional", length = 50)
    private String registroProfissional;

    @Column(nullable = false)
    private Boolean ativo = Boolean.TRUE;

}

