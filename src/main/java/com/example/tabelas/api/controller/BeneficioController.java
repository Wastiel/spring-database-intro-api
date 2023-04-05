package com.example.tabelas.api.controller;

import com.example.tabelas.domain.model.entity.Beneficio;
import com.example.tabelas.domain.model.service.BeneficioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficio")
@AllArgsConstructor
public class BeneficioController {
    private BeneficioService beneficioService;

    @GetMapping
    public ResponseEntity<List<Beneficio>> findAll(){
        return ResponseEntity.ok(beneficioService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Beneficio> findById(@PathVariable Long id){
        return ResponseEntity.ok(beneficioService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Beneficio> create(@RequestBody Beneficio beneficio){
        return ResponseEntity.ok(beneficio);
    }
}
