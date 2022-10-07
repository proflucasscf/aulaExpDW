package com.company;

import com.company.teste.Animal;

public class Passaro extends Animal {
    private String cor;
    private boolean voa;

    public Passaro(String nome, String especie, double peso, int idade, String cor, boolean voa){
        super(nome, especie, peso, idade);
        this.cor = cor;
        this.voa = voa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void alterarACor(String cor) {
        if (cor == "A") {
            this.cor = cor;
        }
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }
}
