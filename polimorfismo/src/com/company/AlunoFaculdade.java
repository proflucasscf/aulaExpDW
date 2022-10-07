package com.company;

public class AlunoFaculdade extends Aluno {

    private String curso;
    private int periodo;

    public AlunoFaculdade(String nome, int idade, String endereco, int matricula, String curso) {
        super(nome, idade, endereco, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}
