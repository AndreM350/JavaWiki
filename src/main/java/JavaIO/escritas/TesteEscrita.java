package JavaIO.escritas;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //Fluxo de Saída com Arquivo Criando um arquivo
        //Exige tratamento de exceção do tipo checked
        FileOutputStream fos = new FileOutputStream("lorem2.txt");// criando o fluxo de saída para um arquivo
        Writer osw = new OutputStreamWriter(fos); //transformar os binários em caracteres
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Olá meu nome é: ");
        bw.newLine();
        bw.write("André!");


        bw.close();

    }
}
