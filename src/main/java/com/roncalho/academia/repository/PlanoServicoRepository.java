package com.roncalho.academia.repository;

import com.roncalho.academia.model.PlanoServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoServicoRepository extends JpaRepository<PlanoServico, Long> {
}

