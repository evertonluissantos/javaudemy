package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio5Condicional {

    public static void main(String[] args) {

        // Cria o objeto Scanner para ler dados do usuário
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int codigo;
        int qtde;
        double valor = 0.0; // inicializado para evitar erro de compilação

        // Entrada de dados
        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();

        System.out.print("Digite a quantidade que você irá comprar: ");
        qtde = sc.nextInt();

        // Estrutura condicional para definir o valor do produto
        if (codigo == 1) {
            valor = qtde * 4.0; // Cachorro quente
        }
        else if (codigo == 2) {
            valor = qtde * 4.5; // X-salada
        }
        else if (codigo == 3) {
            valor = qtde * 5.0; // X-bacon
        }
        else if (codigo == 4) {
            valor = qtde * 2.0; // Torrada simples
        }
        else if (codigo == 5) {
            valor = qtde * 1.5; // Refrigerante
        }
        else {
            // Caso o código seja inválido
            System.out.println("Código inválido!");
            sc.close();
            return; // Encerra o programa aqui
        }

        // Impressão do resultado (fora do if para evitar repetição)
        System.out.printf("Total: R$ %.2f%n", valor);

        // Fecha o Scanner (boa prática)
        sc.close();
    }
}