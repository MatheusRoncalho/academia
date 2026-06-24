package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.PlanoServico;

public record PlanoServicoResponse(
        Long id,
        Long planoId,
        String planoNome,
        Long servicoId,
        String servicoNome
) {
    private static PlanoServicoResponse from(PlanoServico planoServico) {
        return new PlanoServicoResponse(
                planoServico.getId(),
                planoServico.getPlano().getId(),
                planoServico.getPlano().getNome(),
                planoServico.getServico().getId(),
                planoServico.getServico().getNome()
        );
    }
}
