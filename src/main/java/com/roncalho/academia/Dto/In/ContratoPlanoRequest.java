package com.roncalho.academia.Dto.In;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

public record ContratoPlanoRequest(
        @NotNull(message = "O ID do aluno é obrigatório") Long alunoId,
        @NotNull(message = "O ID do plano é obrigatório") Long planoId,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) @NotNull(message = "A data de início é obrigatória") String dataInicio,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) @NotNull(message = "A data de fim é obrigatória") String dataFim
) {
}
