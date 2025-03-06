package Exercicio_11;

import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = sc.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        System.out.print("Sequencia: ");
        for (int i= valorInicial; i < 100; i += incremento){
            System.out.print(i);

            if (i + incremento < 100){
                System.out.print(", ");
            } else System.out.print(".");
        }

        sc.close();
    }
}
