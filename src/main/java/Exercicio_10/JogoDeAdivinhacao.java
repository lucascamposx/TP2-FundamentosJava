package Exercicio_10;

import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numAleatorio = random.nextInt(100) + 1;
        int numDigitado;

        do {
            System.out.println("Digite um numero entre 1 e 100: ");
            numDigitado = sc.nextInt();

            if (numDigitado > numAleatorio){
                System.out.println("O numero é menor que " + numDigitado);
            } else if (numDigitado < numAleatorio){
                System.out.println("O numero é maior que " + numDigitado);
            } else {
                System.out.println("Parabens! Voce acertou, o numero é " + numAleatorio);
            }

        } while(numAleatorio != numDigitado);

        sc.close();
    }
}
