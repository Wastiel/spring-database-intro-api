package com.example.tabelas;

import com.example.tabelas.domain.model.entity.Departamento;
import com.example.tabelas.domain.model.entity.Funcionario;
import com.example.tabelas.domain.model.service.BeneficioService;
import com.example.tabelas.domain.model.service.DepartamentoService;
import com.example.tabelas.domain.model.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Runner implements ApplicationRunner {

    private FuncionarioService funcionarioService;
    private DepartamentoService departamentoService;
    private BeneficioService beneficioService;
    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println("Teste de inicio de aplicação");

        var departamento = new Departamento();
        var funcionario1 = new Funcionario();
        var funcionario2 = new Funcionario();

        departamento.setDescricao("financeiro");
        departamentoService.create(departamento);

        funcionario1.setNome("Willian");
        funcionario1.setDepartamento(departamento);

        funcionario2.setNome("Tiago");
        funcionario2.setDepartamento(departamento);

        funcionarioService.create(funcionario1);
        funcionarioService.create(funcionario2);




    }
}
