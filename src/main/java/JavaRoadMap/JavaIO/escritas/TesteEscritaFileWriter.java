package JavaRoadMap.JavaIO.escritas;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de Saída com Arquivo Criando um arquivo
        //Exige tratamento de exceção do tipo checked
//        FileOutputStream fos = new FileOutputStream("lorem2.txt");// criando o fluxo de saída para um arquivo
//        Writer osw = new OutputStreamWriter(fos); //transformar os binários em caracteres
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));


        fw.write("Dado inserido via filewriter");
        fw.write("\n");  //equivalente ao newline do bufferedWriter
        fw.write(System.lineSeparator());  //equivalente ao newline do bufferedWriter
        //system.lineSeparator() devolve o /n em qualquer sistema operacional
        fw.write("Dado inserido via fileWriter linha 3");

        //fw.close();

        //passando o fileWriter pra dentro do bufferedWriter
        bw.write("Dado inserido via filewriter");
        bw.newLine();
        bw.newLine();
        bw.write("Dado inserido via filewriter linha 3");

        bw.close();


    }
}
