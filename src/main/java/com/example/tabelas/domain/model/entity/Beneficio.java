package com.example.tabelas.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "beneficio")
public class Beneficio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descricao;

    @ManyToMany
    @JoinTable(name="funcionario_beneficio",
            joinColumns = {@JoinColumn(name= "beneficio_id")},
            inverseJoinColumns = {@JoinColumn(name = "funcionario_id")})
    private List<Funcionario> funcionario;

    //private Funcionario funcionario;

}
