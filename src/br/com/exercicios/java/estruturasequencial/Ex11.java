package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Calculando os números =====");
        System.out.println();
        System.out.printf("Digite o primeiro número inteiro: ");
        int numeroInteiro1 = sc.nextInt();
        System.out.printf("Digite o segundo número inteiro: ");
        int numeroInteiro2 = sc.nextInt();
        System.out.printf("Digite um número real: ");
        double numeroReal = sc.nextDouble();
        System.out.println("---------------------------------");
        System.out.println("o produto do dobro do primeiro com metade do segundo .");
        System.out.println((numeroInteiro1 * 2)*(numeroInteiro2 / 2));
        System.out.println("a soma do triplo do primeiro com o terceiro");
        System.out.println((numeroInteiro1 * 3)+ numeroReal);
        System.out.println("o terceiro elevado ao cubo.");
        System.out.printf("%.2f" , Math.pow(numeroReal,3));

        sc.close();
    }
}
