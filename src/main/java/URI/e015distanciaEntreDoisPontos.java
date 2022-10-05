package URI;

import java.util.Scanner;

public class e015distanciaEntreDoisPontos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //sqr.root > (x2-x1)^2 + (y2-y1)^2

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();


        double inside  = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println(String.format("%.4f",inside));


    }

}
