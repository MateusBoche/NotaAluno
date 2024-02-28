package Projeto;

import Entidades.Aluno;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Exercicio app = new Exercicio();
        app.start();
    }

    private void start() {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        aluno.nota3 = scanner.nextDouble();


        System.out.println(aluno.verificarNota());


    }
}
