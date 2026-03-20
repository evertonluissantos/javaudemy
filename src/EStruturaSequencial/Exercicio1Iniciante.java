package EStruturaSequencial;

import java.util.Scanner;

public class Exercicio1Iniciante {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma entre os valores é: " + soma);


        sc.close();
    }
}
