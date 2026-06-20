package com.roncalho.academia.model;

import com.roncalho.academia.enums.ContratoStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "contrato_plano")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContratoPlano extends AbstractAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @ManyToOne(optional = false)
    @JoinColumn(name = "plano_id", nullable = false)
    private Plano plano;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDate dataFim;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private ContratoStatus status;

    @PrePersist
    @PreUpdate
    private void validateDates() {
        if (dataFim != null && dataInicio != null && dataFim.isBefore(dataInicio)) {
            throw new IllegalArgumentException("data_fim precisa ser maior ou igual a data_inicio");
        }
    }

}

