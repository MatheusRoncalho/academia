package com.roncalho.academia.Dto.Out;

import java.time.LocalDate;

public record AcompanhamentoResponse(
        Long id,
        Long alunoId,
        String alunoNome,
        Long profissionalId,
        String profissionalNome,
        Long servicoId,
        String servicoNome,
        LocalDate dataAtendimento,
        String observacoes,
        LocalDate proximoRetorno
) {
}
