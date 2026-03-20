package EStruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4Iniciante {

    public static void main(String[] args) {

        int numberEmployee;
        int hoursWorked;
        double hourlyRate;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui o número de registro do colaborador: ");
        numberEmployee = sc.nextInt();
        System.out.print("Quantas horas o colaborador trabalhou: ");
        hoursWorked = sc.nextInt();
        System.out.print("Qual é o valor da hora do colaborador: ");
        hourlyRate = sc.nextDouble();

        double salaryReceive = hourlyRate * hoursWorked;
        System.out.println("O número do colaborador: " + numberEmployee);
        System.out.printf("Salário a receber: U$%.2f", salaryReceive);

        sc.close();
    }
}
