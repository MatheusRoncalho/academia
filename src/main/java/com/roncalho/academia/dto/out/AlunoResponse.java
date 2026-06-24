package com.roncalho.academia.dto.out;

import com.roncalho.academia.model.Aluno;

import java.time.LocalDate;

public record AlunoResponse(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String email,
        LocalDate dataNascimento,
        LocalDate dataCadastro
) {
    private static AlunoResponse fromEntity(Aluno aluno) {
        return new AlunoResponse(
                aluno.getId(),
                aluno.getNome(),
                aluno.getCpf(),
                aluno.getTelefone(),
                aluno.getEmail(),
                aluno.getDataNascimento(),
                aluno.getDataCadastro()
        );
    }
}
