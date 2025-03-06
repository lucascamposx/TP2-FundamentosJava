package Exercicio_01;

import java.util.Scanner;

public class CadastroDeUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome completo da sua mãe: ");
        String nomeMae = sc.nextLine();

        System.out.println("Digite o nome completo de seu pai: ");
        String nomePai = sc.nextLine();

        System.out.println("\n######################");
        System.out.println("### Dados Pessoais ###");
        System.out.println("######################");
        System.out.println("\nNome do Usuario: " + nomeUsuario);
        System.out.println("idade do Usuario: " + idade);
        System.out.println("Nome da Mae: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);

        int tamanhoNomeUsuario = nomeUsuario.replace(" ", "").length();
        int tamanhoNomeMae = nomeMae.replace(" ", "").length();
        int tamanhoNomePai = nomePai.replace(" ", "").length();

        if (tamanhoNomeMae == tamanhoNomePai && tamanhoNomeMae == tamanhoNomeUsuario) {
            System.out.println("Todos os nomes tem o mesmo tamanho");
        } else if (tamanhoNomeUsuario > tamanhoNomePai && tamanhoNomeUsuario > tamanhoNomeMae) {
            System.out.println("O nome do usuario é maior com " + tamanhoNomeUsuario + " letras");
        } else if (tamanhoNomeMae > tamanhoNomePai && tamanhoNomeMae > tamanhoNomeUsuario) {
            System.out.println("O nome da mae é maior com " + tamanhoNomeMae + " letras");
        } else if (tamanhoNomePai > tamanhoNomeMae && tamanhoNomePai > tamanhoNomeUsuario) {
            System.out.println("O nome do pai é maior com " + tamanhoNomePai + " letras");
        } else {
            if (tamanhoNomeMae == tamanhoNomePai && tamanhoNomePai > tamanhoNomeUsuario) {
                System.out.println("O nome do pai e da mae é maior com " + tamanhoNomePai + " letras");
            } else if (tamanhoNomeMae == tamanhoNomeUsuario && tamanhoNomeMae > tamanhoNomePai) {
                System.out.println("O nome do usuario e da mae é maior com " + tamanhoNomeMae + " letras");
            } else if (tamanhoNomePai == tamanhoNomeUsuario && tamanhoNomePai > tamanhoNomeMae) {
                System.out.println("O nome do usuario e do pai é maior com " + tamanhoNomePai + " letras");
            }
        }

        sc.close();
    }
}
