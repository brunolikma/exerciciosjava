package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println("===== Qual o seu salário por mês =====");
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quanto você ganha por hora ? ");
        double valorHora = sc.nextDouble();

        System.out.printf("Digite qunatas horas você trabalhou ? ");
        double horasTrabalhadas = sc.nextDouble();

        double totalSalario = valorHora * horasTrabalhadas;

        System.out.printf("O seu salário referente a esse mês é: R$ %.2f " , totalSalario);

        sc.close();
    }
}
