package CodeChallengeWebsites.URIBeeCrowd;

import java.util.Scanner;

public class e019tempo {

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
 e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int seconds = input.nextInt();

        int t1 = 0;
        int t2 = 0;
        int t3 = 0;


        if (seconds > 0 && seconds < 59) {
            t1 += seconds;
        }
        if (seconds >= 60 && seconds < 3600) {

            t2 = seconds / 60;
            int rest = seconds % 60;
            t1 += rest;
        }
        if (seconds >= 3600 && seconds < 360000) {

            t3 = seconds / 3600;
            int rest1 = seconds % 3600;

                if (rest1 >= 60 && rest1 < 3600) {
                    t2 = rest1 / 60;
                    int rest2 = rest1 % 60;
                }
                    if (rest1 > 0 && rest1 < 59) {
                        t1 += rest1;
                    }
        }

        System.out.println(t3 + ":" + t2 + ":" + t1);


    }

}
