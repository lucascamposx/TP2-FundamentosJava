package Exercicio_05;

import java.util.Scanner;

public class CalculadorasDeDescontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        float valorCompra = sc.nextFloat();
        float valorComDesconto;

        if (valorCompra > 1000) {
            valorComDesconto = valorCompra * 0.9f; // Aplica desconto de 10%
            System.out.println("Valor Original: R$" + valorCompra);
            System.out.println("Valor dom desconto: R$" + valorComDesconto);

        } else if (valorCompra >= 500 && valorCompra <= 1000) {
            valorComDesconto = valorCompra * 0.95f; // Aplica desconto de 5%
            System.out.println("Valor Original: R$" + valorCompra);
            System.out.println("Valor dom desconto: R$" + valorComDesconto);

        } else {
            System.out.println("Valor da compra: R$" + valorCompra);
            System.out.println("Não tem descontos para compras abaixo de R$ 500");
        }

        sc.close();
    }
}
