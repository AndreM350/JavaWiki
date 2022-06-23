package HackerRank.Introduction;

import java.util.Scanner;

public class hr003intDoubleStringOut {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        input.nextLine();
        String c = input.nextLine();


        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);


    }
}
