package org.example;

public class FuncionarioPj extends Funcionario{

    public FuncionarioPj(String nome, String cpf, Double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public void calcularSalario(){
        Double salario = super.getSalarioBase() * 1.5 + 400;
        super.setSalarioBase(salario);
    }
}
