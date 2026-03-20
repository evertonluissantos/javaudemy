package EStruturaSequencial;

import java.util.Scanner;

public class Exercicio3Iniciante {

    public static void main(String[] args) {

        int a, b, c, d;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.print("Digite o quarto número: ");
        d = sc.nextInt();

        int dif = (a * b) - (c * d);
        System.out.println("Diferença: " + dif);

        sc.close();

    }
}
