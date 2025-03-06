package Exercicio_12;

import java.util.Scanner;

public class ContagemDePalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        int contagem = 0;

        for (String palavras : frase.split(" ")) {
            contagem++;
        }

        System.out.println("A Frase tem " + contagem + " palavras");

        sc.close();
    }
}
