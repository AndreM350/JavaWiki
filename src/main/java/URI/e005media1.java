package URI;

import java.util.Scanner;

public class e005media1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double p1 = 3.5;
        double p2 = 7.5;


        double media = ((A*p1) + (B*p2)) / (p1+p2);


        System.out.println("MEDIA = " + String.format("%.5f",media));

    }
}
