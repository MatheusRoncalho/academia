package com.roncalho.academia.dto.in;

import jakarta.validation.constraints.NotBlank;

public record ServicoRequest(
        @NotBlank(message = "O nome é obrigatório") String nome,
        String descricao,
        Boolean ativo
) {
}
