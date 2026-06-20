package com.roncalho.academia.repository;

import com.roncalho.academia.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    List<Pagamento> findByContratoPlanoId(Long contratoPlanoId);
}

