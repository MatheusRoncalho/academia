package com.roncalho.academia.dto.out;

public record ServicoResponse(
        Long id,
        String nome,
        String descricao,
        Boolean ativo
) {
}
