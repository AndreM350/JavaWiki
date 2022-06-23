package URI;

import java.util.Scanner;

public class e008salario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numFuncionario = input.nextInt();
        int horaTrabalhada = input.nextInt();
        double valorHora = input.nextDouble();

        double salario = horaTrabalhada * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.println("SALARY = " + "U$ " + String.format("%.2f",salario)); //saída com 2 casa dec



    }
}
