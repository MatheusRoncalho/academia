package com.roncalho.academia.Dto.Out;

public record ServicoResponse(
        Long id,
        String nome,
        String descricao,
        Boolean ativo
) {
}
