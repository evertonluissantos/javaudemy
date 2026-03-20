package EStruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5Iniciante {

    public static void main(String[] args) {

        int peca1;
        int peca2;
        int qtdePeca1;
        int qtdePeca2;

        double valorPeca1;
        double valorPeca2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código da peça: ");
        peca1 = sc.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        qtdePeca1 = sc.nextInt();

        System.out.print("Digite o valor da peça: ");
        valorPeca1 = sc.nextDouble();

        System.out.print("Digite o código da peça: ");
        peca2 = sc.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        qtdePeca2 = sc.nextInt();

        System.out.print("Digite o valor da peça: ");
        valorPeca2 = sc.nextDouble();

        double valorTotal = (qtdePeca1 * valorPeca1) + (qtdePeca2 * valorPeca2);

        System.out.printf("Valor a pagar é de R$ %.2f", valorTotal );

        sc.close();
    }
}
