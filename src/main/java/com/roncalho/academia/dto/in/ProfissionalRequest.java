package com.roncalho.academia.dto.in;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProfissionalRequest(
        @NotNull(message = "O ID da especialidade é obrigatório") Long especialidadeId,
        @NotBlank(message = "O nome é obrigatório") String nome,
        String cpf,
        String telefone,
        @Email String email,
        String registroProfissional
) {
}
