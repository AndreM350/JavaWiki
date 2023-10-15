package JavaRoadMap.JavaIO.escritas;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo + saída
        //Exige tratamento de exceção do tipo checked

        InputStream fis = System.in; //chama o input do teclado

        //InputStream fis = new FileInputStream("lorem.txt");// criando o fluxo com arquivo
        Reader isr = new InputStreamReader(fis); //transformar os binários em caracteres
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out; // new FileOutputStream("lorem2.txt");// criando o fluxo de saída para um arquivo
        Writer osw = new OutputStreamWriter(fos); //transformar os binários em caracteres
        BufferedWriter bw = new BufferedWriter(osw);


        String linha = br.readLine();


        while (linha != null && !linha.isEmpty()){  //enquanto existir conteúdo leia a linha
            //linha.isEmpty() -> utilizado para encerrar a jvm do input em system.in da linha 11
            bw.write(linha); //escreve o conteúdo de "linha"
            bw.newLine(); //add a linha
            bw.flush();
            linha = br.readLine();
        }
        br.close();
        bw.close();


    }
}
