package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.println("A Soma dos numeros digitados é: " + (numero1 + numero2));

        sc.close();
    }
}
