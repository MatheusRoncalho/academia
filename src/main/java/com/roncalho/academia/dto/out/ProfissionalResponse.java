package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.Profissional;

public record ProfissionalResponse(
        Long id,
        Long especialidadeId,
        String especialidadeNome,
        String nome,
        String telefone,
        String email,
        String registroProfissional,
        Boolean ativo
) {
    private static ProfissionalResponse fromEntity(Profissional profissional) {
        return new ProfissionalResponse(
                profissional.getId(),
                profissional.getEspecialidade().getId(),
                profissional.getEspecialidade().getNome(),
                profissional.getNome(),
                profissional.getTelefone(),
                profissional.getEmail(),
                profissional.getRegistroProfissional(),
                profissional.getAtivo()
        );
    }
}
