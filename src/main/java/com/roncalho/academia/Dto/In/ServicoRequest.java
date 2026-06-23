package com.roncalho.academia.Dto.In;

import jakarta.validation.constraints.NotBlank;

public record ServicoRequest(
        @NotBlank(message = "O nome é obrigatório") String nome,
        String descricao,
        Boolean ativo
) {
}
