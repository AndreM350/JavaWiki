package CodeChallengeWebsites.URIBeeCrowd;

import java.util.Scanner;

public class e016distanciaDoisVeiculos {

    /*Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int x = 60;
        int y = 90;

        int dif = y-x;

        int hora = 60;

        int res = 60/dif;

        int i = input.nextInt();

        System.out.println((i*res) + " minutos");






    }

}
