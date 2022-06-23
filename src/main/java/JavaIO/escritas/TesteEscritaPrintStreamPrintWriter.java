package JavaIO.escritas;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

//        Fluxo de Saída com Arquivo Criando um arquivo
//        Exige tratamento de exceção do tipo checked

//        FileOutputStream fos = new FileOutputStream("lorem2.txt");// criando o fluxo de saída para um arquivo
//        Writer osw = new OutputStreamWriter(fos); //transformar os binários em caracteres
//        BufferedWriter bw = new BufferedWriter(osw);

        //PrintStream ps = new PrintStream("lorem2.txt"); //reescreve
        PrintStream ps = new PrintStream(new File("lorem3.txt"));  //cria um novo
        //pode usar também a classe printWriter


        ps.println("Fluxo via printStream");
        ps.println();
        ps.println();
        ps.println("Fluxo via printStream linha 3");

        ps.close();

    }
}
