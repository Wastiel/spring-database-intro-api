package com.example.tabelas.api.controller;

import com.example.tabelas.domain.model.entity.Funcionario;
import com.example.tabelas.domain.model.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@AllArgsConstructor
public class FuncionarioController {
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        return ResponseEntity.ok(funcionarioService.findAll());
    }
    @PostMapping
    public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario){
        return ResponseEntity.ok(funcionario);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id){
        return ResponseEntity.ok(funcionarioService.findById(id));

    }
}
