package com.example.tabelas.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String nascimento;
    private String cpf;
    @ManyToOne
    @JoinColumn(referencedColumnName = "ID")
    private Departamento departamento;

    @ManyToMany
    @JoinTable(name="funcionario_beneficio",
                joinColumns = {@JoinColumn(name= "funcionario_id")},
                inverseJoinColumns = {@JoinColumn(name = "beneficio_id")})
    private List<Beneficio> beneficio;

}
