package com.example.tabelas.api.controller;

import com.example.tabelas.domain.model.entity.Departamento;
import com.example.tabelas.domain.model.service.DepartamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@AllArgsConstructor
public class DepartamentoController {
    private DepartamentoService departamentoService;

    @GetMapping
    public ResponseEntity<List<Departamento>> findAll(){
        return ResponseEntity.ok(departamentoService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Departamento> findById(@PathVariable Long id){
        return ResponseEntity.ok(departamentoService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Departamento> create(@RequestBody Departamento departamento){
        return ResponseEntity.ok(departamento);
    }
}
