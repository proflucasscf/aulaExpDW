package com.company;

import com.company.teste.Animal;

public class Cachorro extends Animal {
    private String raca;
    private String porte;

    public Cachorro(String nome, String especie, double peso, int idade, String raca, String porte) {
        super(nome, especie, peso, idade);
        this.raca = raca;
        this.porte = porte;
        this.nome = "Toto";
    }

    // Sobrescrita
    @Override
     public String getNome() {
        System.out.println("O nome eh: ");
        return super.getNome();
    }

    // Sobrecarga
    public String getNome(String a, int b) {
        a = "b";
        return a;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

}
