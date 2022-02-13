package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("===== Salário Líquido =====");
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o Valor da sua hora trabalhada: ");
        double salarioHora = sc.nextDouble();

        System.out.printf("Digite quantas horas você trabalhou no mês: ");
        double horasTrabalhasdas = sc.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhasdas;
        double salarioIR = (salarioBruto * (11.0 / 100.0));
        double salarioINSS = (salarioBruto * (8.0 / 100.0));
        double salarioSindicato = (salarioBruto * (5.0 / 100.0));
        double salarioLiquido = salarioBruto - salarioIR - salarioINSS - salarioSindicato;

        System.out.printf("Salário Bruto : R$ %.2f %n", salarioBruto);
        System.out.printf("IR: R$ %.2f %n" , salarioIR);
        System.out.printf("INSS: R$ %.2f %n" , salarioINSS);
        System.out.printf("Sindicato: %.2f %n" , salarioSindicato);
        System.out.printf("Salário Liquido : R$ %.2f %n" , salarioLiquido);

        sc.close();

    }
}
