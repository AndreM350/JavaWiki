package CodeChallengeWebsites.URIBeeCrowd;

import java.util.Scanner;

public class e014consumo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double A = input.nextDouble();
        double B = input.nextDouble();

        double consumo =  (A / B);

        System.out.println(String.format("%.3f",consumo) + " km/l");




    }

}
