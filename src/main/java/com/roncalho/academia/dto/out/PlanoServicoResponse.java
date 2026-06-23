package com.roncalho.academia.dto.out;

public record PlanoServicoResponse(
        Long id,
        Long planoId,
        String planoNome,
        Long servicoId,
        String servicoNome
) {
}
