package com.roncalho.academia.repository;

import com.roncalho.academia.model.ContratoPlano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContratoPlanoRepository extends JpaRepository<ContratoPlano, Long> {
    List<ContratoPlano> findByAlunoId(Long alunoId);
}

