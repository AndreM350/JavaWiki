package JavaRoadMap.PackageDeTesteDeFuncao;

import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {

        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        while (casos != 0){
            poderDeLuta = ler.nextInt();

            if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
            casos--;
        }
    }
}
