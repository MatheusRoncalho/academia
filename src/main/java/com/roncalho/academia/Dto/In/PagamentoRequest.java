package com.roncalho.academia.Dto.In;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.roncalho.academia.enums.PagamentoStatus;
import jakarta.validation.constraints.NotNull;
import com.roncalho.academia.enums.FormaPagamento;

import java.math.BigDecimal;

public record PagamentoRequest(
        @NotNull(message = "O ID do contrato é obrigatório") Long contratoPlanoId,
        @NotNull(message = "O valor é obrigatório") BigDecimal valor,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) String dataPagamento,
        @NotNull(message = "A forma de pagamento é obrigatória") FormaPagamento formaPagamento,
        @NotNull(message = "O status é obrigatório") PagamentoStatus status,
        String referencia
) {
}
