package PackageDeTesteDeFuncao;

import java.util.Scanner;

public class contadorNumeros {
    public static void main(String[] args) {

        double contador = 0;
        double media = 0;
        double total = 0;

        while (contador <= 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o valor: " + (contador + 1));
            int a = input.nextInt();
            contador += 1;
            total += a;
        }
        media = total / contador;
        System.out.println("A m�dia dos valores �: " + media);
        System.out.println("O total foi de: " + total);

    }

}