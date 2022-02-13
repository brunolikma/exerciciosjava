package br.com.exercicios.java.estruturasequencial;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("===== João o Pescador =====");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o Peso do Peixe: ");
        double pesoPeixe = sc.nextDouble();
        if (pesoPeixe <= 50 ) {
            System.out.println("João seu Peixe tem " + pesoPeixe + " kilos! ");
            System.out.println("Esta Permitido !");
        }
        else {
            double multa = (pesoPeixe - 50) * 4;
            System.out.printf("João sua multa é de R$ %.2f reais" , multa );
        }

    }
}
