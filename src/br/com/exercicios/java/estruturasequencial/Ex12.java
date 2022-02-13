package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("===== Peso Ideal =====");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite sua Altura: ");
        double altura = sc.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("Seu peso Ideal é: %.2f" , pesoIdeal);

        sc.close();
    }
}
