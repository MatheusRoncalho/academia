package com.roncalho.academia.dto.in;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PlanoRequest(
        @NotBlank(message = "O nome é obrigatório") String nome,
        String descricao,
        @NotNull(message = "A duração em meses é obrigatória") Integer duracaoMeses,
        @NotNull(message = "O valor é obrigatório") BigDecimal valor
) {
}
