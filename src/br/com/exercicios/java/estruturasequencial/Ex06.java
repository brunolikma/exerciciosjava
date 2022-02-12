package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("===== Calcule a área do Circulo =====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Valor do Raio: ");
        double raio = sc.nextDouble();
        double pi = Math.PI;

        double formula = pi * Math.pow(raio, 2);

        System.out.printf("A área de seu circulo é: %.2f " , formula);

        sc.close();
    }
}
