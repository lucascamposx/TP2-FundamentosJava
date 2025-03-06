package Exercicio_03;

import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valorDolar = 5.88f;
        float valorEuro = 6.12f;
        float valorLibra = 7.40f;
        float valorConvertido;

        System.out.println("Digite um valor em reais: ");
        float valorReais = sc.nextFloat();

        System.out.print("Para qual moeda deseja converter? Dólar, Euro ou Libra: ");
        String moeda = sc.next().toLowerCase();

        switch (moeda) {
            case "dolar":
            case "dólar":
                valorConvertido = valorReais / valorDolar;
                System.out.println(String.format("R$ %.2f convertido em dólar é igual a %.2f USD",
                valorReais, valorConvertido));
                break;
            case "euro":
                valorConvertido = valorReais / valorEuro;
                System.out.println(String.format("R$ %.2f convertido em euro é igual a %.2f EUR",
                valorReais, valorConvertido));
                break;
            case "libra":
                valorConvertido = valorReais / valorLibra;
                System.out.println(String.format("R$ %.2f convertido em libra é igual a %.2f GBP",
                valorReais, valorConvertido));
                break;
            default:
                System.out.println("Resposta Invalida");
                break;
        }

        sc.close();
    }
}
