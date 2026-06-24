package com.roncalho.academia.dto.out;

import java.time.LocalDate;
import com.roncalho.academia.enums.ContratoStatus;
import com.roncalho.academia.model.ContratoPlano;

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
    private static ContratoPlanoResponse fromEntity(ContratoPlano contratoPlano) {
        return new ContratoPlanoResponse(
                contratoPlano.getId(),
                contratoPlano.getAluno().getId(),
                contratoPlano.getAluno().getNome(),
                contratoPlano.getPlano().getId(),
                contratoPlano.getPlano().getNome(),
                contratoPlano.getDataInicio(),
                contratoPlano.getDataFim(),
                contratoPlano.getStatus()
        );
    }
}
