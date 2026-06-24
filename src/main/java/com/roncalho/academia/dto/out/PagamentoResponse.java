package com.roncalho.academia.dto.out;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.roncalho.academia.enums.FormaPagamento;
import com.roncalho.academia.enums.PagamentoStatus;
import com.roncalho.academia.model.Pagamento;

public record PagamentoResponse(
        Long id,
        Long contratoPlanoId,
        BigDecimal valor,
        LocalDate dataPagamento,
        FormaPagamento formaPagamento,
        PagamentoStatus status,
        String referencia
) {
    private static PagamentoResponse fromEntity(Pagamento pagamento) {
        return new PagamentoResponse(
                pagamento.getId(),
                pagamento.getContratoPlano().getId(),
                pagamento.getValor(),
                pagamento.getDataPagamento(),
                pagamento.getFormaPagamento(),
                pagamento.getStatus(),
                pagamento.getReferencia()
        );
    }
}
