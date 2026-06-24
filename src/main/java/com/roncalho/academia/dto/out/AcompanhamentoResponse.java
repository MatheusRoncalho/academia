package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.Acompanhamento;

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
    private static AcompanhamentoResponse fromEntity(Acompanhamento acompanhamento) {
        return new AcompanhamentoResponse(
                acompanhamento.getId(),
                acompanhamento.getAluno().getId(),
                acompanhamento.getAluno().getNome(),
                acompanhamento.getProfissional().getId(),
                acompanhamento.getProfissional().getNome(),
                acompanhamento.getServico().getId(),
                acompanhamento.getServico().getNome(),
                acompanhamento.getDataAtendimento(),
                acompanhamento.getObservacoes(),
                acompanhamento.getProximoRetorno()
        );
    }
}
