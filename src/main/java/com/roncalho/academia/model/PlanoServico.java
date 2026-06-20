package com.roncalho.academia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "plano_servico", uniqueConstraints = @UniqueConstraint(columnNames = {"plano_id", "servico_id"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "plano_id", nullable = false)
    private Plano plano;

    @ManyToOne(optional = false)
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;

}

