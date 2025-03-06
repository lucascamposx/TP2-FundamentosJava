package Exercicio_08;

import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1 do triangulo: ");
        float lado1 = sc.nextFloat();

        System.out.println("Digite o comprimento do lado 2 do triangulo: ");
        float lado2 = sc.nextFloat();

        System.out.println("Digite o comprimento do lado 3 do triangulo: ");
        float lado3 = sc.nextFloat();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("É um Triângulo Equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("É um Triângulo Isósceles");
            } else {
                System.out.println("É um Triângulo Escaleno");
            }
        } else {
            System.out.println("Esse Triangulo nao é valido");
        }

        sc.close();
    }
}
