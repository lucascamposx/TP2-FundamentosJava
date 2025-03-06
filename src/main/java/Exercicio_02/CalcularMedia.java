package Exercicio_02;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua nota do Primeiro bimestre: ");
        float Nota1 = sc.nextFloat();

        System.out.println("Insira sua nota do Segundo bimestre: ");
        float Nota2 = sc.nextFloat();

        System.out.println("Insira sua nota do Terceiro bimestre: ");
        float Nota3 = sc.nextFloat();

        System.out.println("Insira sua nota do Quarto bimestre: ");
        float Nota4 = sc.nextFloat();

        float media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

        if (media >= 7) {
            System.out.println("Sua Média é: " + media + ", Voce foi aprovado");
        } else if (media >= 5 && media < 6.9) {
            System.out.println("Sua Média é: " + media + ", Voce esta de recuperacao");
        } else if (media < 5) {
            System.out.println("Sua Média é: " + media + ", Voce foi reprovado");
        }

        sc.close();
    }
}
