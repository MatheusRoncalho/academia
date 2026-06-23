package com.roncalho.academia.Dto.In;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AlunoRequest(
        @NotBlank(message = "O nome é obrigatório") String nome,
        @NotBlank(message = "O CPF é obrigatório") String cpf,
        String telefone,
        @Email String email,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) String dataNascimento,
        @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) String dataCadastro
) {
}
