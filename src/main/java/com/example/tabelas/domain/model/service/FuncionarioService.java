package com.example.tabelas.domain.model.service;

import com.example.tabelas.domain.model.entity.Funcionario;
import com.example.tabelas.domain.model.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }
    public Funcionario create(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario update(Long id,Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public void delete(Long id){
        funcionarioRepository.deleteById(id);
    }

    public Funcionario findById(Long id) {
        return funcionarioRepository.findById(id).orElseThrow();
    }
}
