package CodeChallengeWebsites.URIBeeCrowd;

import java.util.Scanner;

public class e010calculoSimples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codp1 = input.nextInt();
        int nump1 = input.nextInt();
        double valorp1 = input.nextDouble();

        int codp2 = input.nextInt();
        int nump2 = input.nextInt();
        double valorp2 = input.nextDouble();

        double t1 = nump1 * valorp1;
        double t2 = nump2 * valorp2;

        double totalGeral = t1 + t2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f",totalGeral));



    }
}
