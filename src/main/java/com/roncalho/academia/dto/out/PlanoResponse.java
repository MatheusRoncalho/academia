package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.Plano;

import java.math.BigDecimal;

public record PlanoResponse(
        Long id,
        String nome,
        String descricao,
        Integer duracaoMeses,
        BigDecimal valor,
        Boolean ativo
) {
    private static PlanoResponse fromEntity(Plano plano) {
        return new PlanoResponse(
                plano.getId(),
                plano.getNome(),
                plano.getDescricao(),
                plano.getDuracaoMeses(),
                plano.getValor(),
                plano.getAtivo()
        );
    }
}
