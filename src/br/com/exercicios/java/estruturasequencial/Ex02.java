package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println("O numero informado foi " + numero);

        sc.close();

    }

}
