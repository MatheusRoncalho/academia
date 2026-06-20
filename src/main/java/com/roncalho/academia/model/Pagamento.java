package com.roncalho.academia.model;

import com.roncalho.academia.enums.FormaPagamento;
import com.roncalho.academia.enums.PagamentoStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagamento extends AbstractAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contrato_plano_id", nullable = false)
    private ContratoPlano contratoPlano;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento", length = 20, nullable = false)
    private FormaPagamento formaPagamento;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private PagamentoStatus status;

    @Column(length = 20)
    private String referencia;

    @PrePersist
    private void validate() {
        if (valor == null || valor.signum() <= 0) {
            throw new IllegalArgumentException("valor precisa ser maior que 0");
        }
    }

}

