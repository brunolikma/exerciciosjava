package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("===== Convertendo Fahrenheit em graus Celsius =====");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Fahrenheit: ");
        int fahrenheit = sc.nextInt();

        System.out.println("Hoje esta fazendo " + 5 * ((fahrenheit-32) / 9) + " graus Celsius");

        sc.close();
    }
}
