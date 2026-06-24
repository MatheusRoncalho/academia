package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.Servico;

public record ServicoResponse(
        Long id,
        String nome,
        String descricao,
        Boolean ativo
) {
    private static ServicoResponse fromEntity(Servico servico) {
        return new ServicoResponse(
                servico.getId(),
                servico.getNome(),
                servico.getDescricao(),
                servico.getAtivo()
        );
    }
}
