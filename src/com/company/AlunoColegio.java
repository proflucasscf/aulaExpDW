package com.company;

public class AlunoColegio extends Aluno {

    private int ano;

    public AlunoColegio(String nome, int idade, String endereco, int matricula, int ano) {
        super(nome, idade, endereco, matricula);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
