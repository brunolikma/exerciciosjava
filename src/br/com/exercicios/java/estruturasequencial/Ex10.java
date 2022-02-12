package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("===== Convertendo graus Celsius em Fahrenheit =====");
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a temperatura em graus Celsius: ");
        int grausCelsius = sc.nextInt();

        double fahrenheit = ( grausCelsius * 9/5 ) + 32;

        System.out.printf("Hoje esta fazendo %.1f" , fahrenheit , " Fahrenheit");

        sc.close();
    }




}
