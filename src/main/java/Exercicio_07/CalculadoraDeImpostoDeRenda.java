package Exercicio_07;

import java.util.Scanner;

public class CalculadoraDeImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário bruto anual: ");
        float salarioAnual = sc.nextFloat();
        float aliquota = 0f;
        float deducao = 0f;

        if (salarioAnual > 64259.59f) {
            aliquota = 27.5f;
            deducao = 896.00f;
        } else if (salarioAnual >= 50148.26f) {
            aliquota = 22.5f;
            deducao = 662.77f;
        } else if (salarioAnual >= 37751.56f) {
            aliquota = 15f;
            deducao = 381.44f;
        } else if (salarioAnual >= 27870.41f) {
            aliquota = 7.5f;
            deducao = 169.44f;
        }

        float imposto = (salarioAnual * aliquota/100) - deducao;
        float salarioLiquidoAnual = salarioAnual - imposto;

        if (imposto == 0f){
            System.out.println("Seu imposto de Renda foi isento");
        } else {
            System.out.println(String.format("Imposto de Renda: %.2f", imposto));
            System.out.println(String.format("Salario liquido Anual: %.2f", salarioLiquidoAnual));
        }

        sc.close();
    }
}
