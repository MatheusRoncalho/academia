package com.roncalho.academia.dto.in;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

public record AcompanhamentoRequest(
        @NotNull(message = "O ID do aluno é obrigatório") Long alunoId,
        @NotNull(message = "O ID do profissional é obrigatório") Long profissionalId,
        @NotNull(message = "O ID do serviço é obrigatório") Long servicoId,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) @NotNull(message = "A data de atendimento é obrigatória") String dataAtendimento,
        String observacoes,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) String proximoRetorno
) {
}
