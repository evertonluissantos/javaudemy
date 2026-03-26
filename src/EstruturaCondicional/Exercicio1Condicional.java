package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1Condicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Esse número é positivo");
        }
        else {
            System.out.println("Esse número é negativo");
        }

        sc.close();
    }
}
