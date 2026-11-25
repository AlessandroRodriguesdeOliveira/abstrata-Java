package org.example;

public abstract class Funcionario {
    private final String nome;
    private final String cpf;
    private Double salarioBase;

    public Funcionario(String nome, String cpf, Double salarioBase) {
        this.salarioBase = salarioBase;
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract void calcularSalario();

    public void exibirDados(){
        System.out.println("Name: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Wage: " + this.salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
