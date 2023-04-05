package com.example.tabelas.domain.model.service;

import com.example.tabelas.domain.model.entity.Departamento;
import com.example.tabelas.domain.model.repository.DepartamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartamentoService {

    private final DepartamentoRepository departamentoRepository;

    public List<Departamento> findAll(){
        return departamentoRepository.findAll();
    }

    public Departamento create(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public Departamento update(long id, Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public void delete (Long id){
        departamentoRepository.deleteById(id);
    }

    public Departamento findById(Long id){
        return departamentoRepository.findById(id).orElseThrow();
    }

}
