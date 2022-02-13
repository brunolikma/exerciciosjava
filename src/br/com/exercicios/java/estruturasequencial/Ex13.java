package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("===== Peso Ideal Homem e Mulher =====");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite sua Altura: ");
        double h = sc.nextDouble();
        double pesoIdealHomem = (72.7 * h) - 58;
        double pesoIdealMulher = (62.1 * h) - 44.7;
        System.out.printf("Seu peso Ideal é: %.2f %n" , pesoIdealHomem);
        System.out.printf("Seu peso Ideal é: %.2f %n", pesoIdealMulher);

        sc.close();
    }
}
