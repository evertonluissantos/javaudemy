package EStruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args) {

        int y = 32;
        int idade = 25;
        double x = 10.35784;
        double renda = 2100;

        String nome = "Maria";

        System.out.println("Olá mundo!");
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        Locale.setDefault(Locale.US);
    }
}
