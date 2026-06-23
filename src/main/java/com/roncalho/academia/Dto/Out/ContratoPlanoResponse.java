package com.roncalho.academia.Dto.Out;

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
