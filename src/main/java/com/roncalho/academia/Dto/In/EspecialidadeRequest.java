package com.roncalho.academia.Dto.In;

import jakarta.validation.constraints.NotBlank;

public record EspecialidadeRequest(
        @NotBlank(message = "O nome é obrigatório") String nome,
        String descricao
) {
}
