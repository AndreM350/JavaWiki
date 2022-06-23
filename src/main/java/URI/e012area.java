package URI;

import java.util.Scanner;
import java.lang.Math;

public class e012area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double triRet  = A * C / 2;
        double circ = pi * (Math.pow(C,2));
        double trap = (A+B)/2 * C;
        double quad = Math.pow(B,2);
        double ret = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f",triRet));
        System.out.println("CIRCULO: " + String.format("%.3f",circ));
        System.out.println("TRAPEZIO: " + String.format("%.3f",trap));
        System.out.println("QUADRADO: " + String.format("%.3f",quad));
        System.out.println("RETANGULO: " + String.format("%.3f",ret));
    }
}
