package JavaIO.leituras;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("src/contas.csv"),"UTF-8");


        while (scanner.hasNextLine()) { //enquanto tiver mais linhas
            String linha = scanner.nextLine();
            //System.out.println(linha);
           // String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));
            //System.out.println(valores[3]);
            //separa cada caractere pela vírgula definida no regex e insere cada um dentro da sua posição do array.

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();


            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %05.2f %n",
                    tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();

        }



        scanner.close();


    }


}
