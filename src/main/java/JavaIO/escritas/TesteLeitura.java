package JavaIO.escritas;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        //Exige tratamento de exceção do tipo checked

        InputStream fis = new FileInputStream("lorem.txt");// criando o fluxo com arquivo
        Reader isr = new InputStreamReader(fis); //transformar os binários em caracteres
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
//        System.out.println(linha);
//        br.close();

        while (linha != null){  //enquanto existir conteúdo leia a linha
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();

    }
}
