package PackageDeTesteDeFuncao;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h +=  1.0 / i;
        }

        System.out.println(Math.round(h));

    }
}