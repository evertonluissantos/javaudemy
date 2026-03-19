package EStruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double d;

        x = sc.next();
        System.out.println("Você digitou: " + x);
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);
        d = sc.nextDouble();
        System.out.println("Você digitou: " + d);

        sc.close();
    }
}
