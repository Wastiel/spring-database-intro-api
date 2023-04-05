package com.example.tabelas.domain.model.repository;

import com.example.tabelas.domain.model.entity.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficioRepository extends JpaRepository <Beneficio, Long> {
}
