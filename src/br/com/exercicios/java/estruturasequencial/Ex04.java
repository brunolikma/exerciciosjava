package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Media do Aluno =====");

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a nota 4: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media do Aluno foi de: " + media);
    }
}
