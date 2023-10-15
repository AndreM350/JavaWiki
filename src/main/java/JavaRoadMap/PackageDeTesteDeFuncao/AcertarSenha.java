package JavaRoadMap.PackageDeTesteDeFuncao;

import java.util.Scanner;

public class AcertarSenha {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int senha = 2002;
        boolean validouLogin = false;

        while (!validouLogin) {
            senha = leitor.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }


        }

    }
}
