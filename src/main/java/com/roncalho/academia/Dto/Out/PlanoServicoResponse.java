package com.roncalho.academia.Dto.Out;

public record PlanoServicoResponse(
        Long id,
        Long planoId,
        String planoNome,
        Long servicoId,
        String servicoNome
) {
}
