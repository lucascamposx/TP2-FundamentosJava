package Exercicio_09;

import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String campo1 = "";
        String campo2 = "";

        System.out.println("Crie uma senha: ");
        campo1 = sc.nextLine();

        do {
            System.out.println("Confirme sua senha: ");
            campo2 = sc.nextLine();

            if (!campo1.equals(campo2)) {
                System.out.println("Senha invalida");
            }

        } while (!campo1.equals(campo2));

        System.out.println("Senha cadastrada com sucesso");

        sc.close();
    }
}
