package com.roncalho.academia.dto.out;

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
