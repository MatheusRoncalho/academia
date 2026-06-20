package com.roncalho.academia.repository;

import com.roncalho.academia.model.Acompanhamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcompanhamentoRepository extends JpaRepository<Acompanhamento, Long> {
    List<Acompanhamento> findByAlunoId(Long alunoId);
    List<Acompanhamento> findByProfissionalId(Long profissionalId);
    List<Acompanhamento> findByServicoId(Long servicoId);
}

