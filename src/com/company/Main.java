package com.company;

import com.company.teste.Animal;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", 70, "Rua 1");
        pessoa.getNome();

        Professor professor = new Professor("Pedro", 60, "Rua 2", 10000);
        professor.getIdade();

        Aluno aluno = new Aluno("Maria", 40, "Rua 3", 111);
        aluno.getMatricula();
        aluno.setNome("Lucas");

        Cachorro cachorro = new Cachorro("Toto", "mamifero", 30, 5, "Pastor", "grande");
        Passaro passaro = new Passaro("Canario", "Ave", 5, 2, "Amarelo", true);

        System.out.println(cachorro.getNome());
        System.out.println(passaro.getNome());

        Animal animal1 = new Passaro("Canario", "Ave", 5, 2, "Amarelo", true);
        Animal animal2 = new Cachorro("Toto", "mamifero", 30, 5, "Pastor", "grande");
        animal2.setNome("Toto");



    }
}
