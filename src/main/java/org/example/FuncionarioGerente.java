package org.example;

public class FuncionarioGerente extends Funcionario{

    public FuncionarioGerente(String nome, String cpf, Double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public void calcularSalario(){
        Double salario = super.getSalarioBase() + 2000.00;
        setSalarioBase(salario);
    }
}
