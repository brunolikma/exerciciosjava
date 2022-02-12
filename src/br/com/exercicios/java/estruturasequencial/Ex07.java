package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("===== Dobro da área do Quadrado =====");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor do lado do Quadrado: ");
        double ladoQuadrado = sc.nextDouble();
        double areaQuadrado = Math.pow(ladoQuadrado,2);

        System.out.printf("O dobro da área do quadrado é: %.2f" , areaQuadrado * 2 );

        sc.close();
    }
}
