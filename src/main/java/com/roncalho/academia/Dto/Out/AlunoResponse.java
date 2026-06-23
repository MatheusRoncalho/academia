package com.roncalho.academia.Dto.Out;

import java.time.LocalDate;

public record AlunoResponse(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String email,
        LocalDate dataNascimento,
        LocalDate dataCadastro) {
}
