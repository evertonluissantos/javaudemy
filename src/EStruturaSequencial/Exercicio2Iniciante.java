package EStruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2Iniciante {

    public static void main(String[] args) {

        double pi = 3.14159;
        double raio;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui o valor do raio do circulo: ");
        raio = sc.nextDouble();

        double area = pi * (raio * raio);
        System.out.printf("O valor da área desse círculo é de: %.4f", area);

        sc.close();
    }
}
