package com.roncalho.academia.Dto.Out;

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
}
