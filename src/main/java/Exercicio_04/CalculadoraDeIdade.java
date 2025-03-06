package Exercicio_04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        // Realiza o calculo considerando anos bissextos
        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
        System.out.println("Voce possui " + idadeEmDias + " dias de vida" );

        sc.close();
    }
}
