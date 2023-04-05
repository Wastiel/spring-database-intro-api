package com.example.tabelas.domain.model.service;

import com.example.tabelas.domain.model.entity.Beneficio;
import com.example.tabelas.domain.model.repository.BeneficioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BeneficioService {

    private final BeneficioRepository beneficioRepository;

    public List<Beneficio> findAll(){
        return beneficioRepository.findAll();
    }

    public Beneficio create(Beneficio beneficio) {
        return beneficioRepository.save(beneficio);
    }

    public Beneficio update(long id, Beneficio beneficio){
        return beneficioRepository.save(beneficio);
    }

    public void delete (Long id){
        beneficioRepository.deleteById(id);
   }

   public Beneficio findById(Long id){
        return beneficioRepository.findById(id).orElseThrow();
   }

}
