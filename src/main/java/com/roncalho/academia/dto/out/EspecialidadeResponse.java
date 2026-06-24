package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.Especialidade;

public record EspecialidadeResponse(
        Long id,
        String nome,
        String descricao
) {
    private static EspecialidadeResponse fromEntity(Especialidade especialidade) {
        return new EspecialidadeResponse(
                especialidade.getId(),
                especialidade.getNome(),
                especialidade.getDescricao()
        );
    }
}
