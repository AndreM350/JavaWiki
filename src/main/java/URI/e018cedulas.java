package URI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e018cedulas {

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
 As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();


        int nota_100 = 100;
        int nota_50 = 50;
        int nota_20 = 20;
        int nota_10 = 10;
        int nota_5 = 5;
        int nota_2 = 2;
        int nota_1 = 1;

        System.out.println(valor);

        if(valor >= 10 && valor <= 1000000) {
            if(nota_100 > 0) {
                nota_100 = valor / 100;
                valor = valor % 100;
                System.out.println(nota_100 + " notas(s) de R$ 100,00");
            }
            if(nota_50 > 0) {
                nota_50 = valor / 50;
                valor = valor % 50;
                System.out.println(nota_50 + " notas(s) de R$ 50,00");
            }
            if(nota_20 > 0) {
                nota_20 = valor / 20;
                valor = valor % 20;
                System.out.println(nota_20 + " notas(s) de R$ 20,00");
            }
            if(nota_10 > 0) {
                nota_10 = valor / 10;
                valor = valor % 10;
                System.out.println(nota_10 + " notas(s) de R$ 10,00");
            }if(nota_5 > 0) {
                nota_5 = valor / 5;
                valor = valor % 5;
                System.out.println(nota_5 + " notas(s) de R$ 5,00");
            }if(nota_2 > 0) {
                nota_2 = valor / 2;
                valor = valor % 2;
                System.out.println(nota_2 + " notas(s) de R$ 2,00");
            }if(nota_1 > 0) {
                nota_1 = valor / 1;
                valor = valor % 1;
                System.out.println(nota_1 + " notas(s) de R$ 1,00");
            }
        }else {
            System.out.println("Presentation Error");
        }






    }

}
