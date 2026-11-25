package org.example;

public class FuncionarioClt extends Funcionario {

    public FuncionarioClt(String nome, String cpf, Double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public void calcularSalario(){
        Double salario = super.getSalarioBase() * 1.2;
        super.setSalarioBase(salario);
    }

}
