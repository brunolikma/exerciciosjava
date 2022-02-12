package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Convertendo Metro para Centimetro =====");

        System.out.printf("Digite quantos metros você deseja converter: ");
        int metros = sc.nextInt();

        System.out.println("A quantidade de " + metros + " metros em centimetros é de: " + (metros * 100) + "cm !" );

        sc.close();
    }
}
