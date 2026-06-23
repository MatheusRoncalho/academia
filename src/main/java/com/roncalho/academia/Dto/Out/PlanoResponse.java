package com.roncalho.academia.Dto.Out;

import java.math.BigDecimal;

public record PlanoResponse(
        Long id,
        String nome,
        String descricao,
        Integer duracaoMeses,
        BigDecimal valor,
        Boolean ativo
) {
}
