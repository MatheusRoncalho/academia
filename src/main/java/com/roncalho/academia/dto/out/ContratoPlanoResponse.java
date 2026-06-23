package com.roncalho.academia.dto.out;

import java.time.LocalDate;
import com.roncalho.academia.enums.ContratoStatus;

public record ContratoPlanoResponse(
        Long id,
        Long alunoId,
        String alunoNome,
        Long planoId,
        String planoNome,
        LocalDate dataInicio,
        LocalDate dataFim,
        ContratoStatus status
) {
}
