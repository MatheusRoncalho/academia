package com.roncalho.academia.Dto.Out;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.roncalho.academia.enums.FormaPagamento;
import com.roncalho.academia.enums.PagamentoStatus;

public record PagamentoResponse(
        Long id,
        Long contratoPlanoId,
        BigDecimal valor,
        LocalDate dataPagamento,
        FormaPagamento formaPagamento,
        PagamentoStatus status,
        String referencia
) {
}
