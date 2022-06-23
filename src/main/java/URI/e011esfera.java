package URI;

import java.util.Scanner;
import java.lang.Math;

public class e011esfera {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3.0) * pi * (Math.pow(raio,3));
        //Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++)
        //Assumem que o resultado da divisão entre dois inteiros é outro inteiro.

        System.out.println("VOLUME = " + String.format("%.3f",volume));

    }
}
