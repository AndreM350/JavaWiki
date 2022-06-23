package TestesGerais;

import java.util.Scanner;

public class TestaFormatacaoString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        //int b = in.nextInt();



        //System.out.printf("%-2s %03d",a ,b);
        System.out.printf("O Valor de a é: " + "%03d", a );

    }
}
