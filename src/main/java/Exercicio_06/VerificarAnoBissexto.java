package Exercicio_06;

import java.util.Scanner;

public class VerificarAnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano :");
        int ano = sc.nextInt();

        // Se o ano não terminar em 00 e for divisível por 4, ele é bissexto.
        if ((ano % 100 != 0) && (ano % 4 == 0)){
            System.out.println("O ano " + ano + " É Bissexto");

        // Os anos terminados em 00 serão bissextos se a divisão deles por 400 for exata.
        } else if ((ano % 100 == 0) && (ano % 400 == 0)){
            System.out.println("O ano " + ano + " É Bissexto");

        } else {
            System.out.println("O ano " + ano + " nao é um ano Bissexto");
        }

        sc.close();
    }
}
