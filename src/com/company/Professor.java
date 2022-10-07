package com.company;

//           subclasse         superclasse
public class Professor extends Pessoa {

    private double salario;
    private String curriculo;

    public Professor(String nome, int idade, String endereco, double salario) {
        super(nome, idade, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
}
