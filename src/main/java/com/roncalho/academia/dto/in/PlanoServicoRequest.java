package com.roncalho.academia.dto.in;

import jakarta.validation.constraints.NotNull;

public record PlanoServicoRequest(
        @NotNull(message = "O ID do plano é obrigatório") Long planoId,
        @NotNull(message = "O ID do serviço é obrigatório") Long servicoId
) {
}
