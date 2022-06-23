package URI;

import java.util.Scanner;

public class e006media2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double p1 = 2;
        double p2 = 3;
        double p3 = 5;


        double media = ((A*p1) + (B*p2) + (C*p3)) / (p1+p2+p3);


        System.out.println("MEDIA = " + String.format("%.1f",media));

    }
}
