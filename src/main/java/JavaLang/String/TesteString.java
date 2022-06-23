package JavaLang.String;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {

        //Strings criadas são imutáveis nesse caso para que a função funcione é necessário criar outro objeto de referência.
        String nome = "Alura"; //‘Strings’ também são objetos - Object Literal
        //String outro = new String("Alura");

        char c = 'A';
        char d = '2';


        //REPLACE
        String outroNome = nome.replace("A", "B"); //Troca uma letra por outra
        String outroNome2 = nome.replace("Al", "BLLLLL"); //Troca varias letras por outras
        String outroNome3 = nome.replace(c, d); //troca utilizando variáveis como parâmetros

        // LOWER E UPPER CASE
        String outroNomeLower = nome.toLowerCase(); //Minusculo
        String outroNomeUpper = nome.toUpperCase(); //Maiúsculo

        //INDEX E POSIÇÕES DE CARACTERES
        char posicaoLetra = nome.charAt(2);     //retornar a letra na posição (sendo index = 0)
        int posicaoIndex = nome.indexOf("ur");  //retornar o index da letra na posição

        //SUBSTRING
        String subString = nome.substring(1);

        //LENGHT - numero de caracteres
        System.out.println("Nome.lenght: " + nome.length());

        for (int i = 0; i < nome.length() ;i++){
            System.out.println(nome.charAt(i));
        }

        //CONTAINS E EMPTY
        System.out.println("--------------- | Contais | ---------------");
        String vazio =  " ";
        String vazioComEspacoRemovido = vazio.trim();
        System.out.println(vazioComEspacoRemovido);
        System.out.println(vazio.isEmpty());    //esse método retorna booleano.
        System.out.println(vazioComEspacoRemovido.isEmpty());    //esse método retorna booleano.

        System.out.println("Nome: Alura > Contains Alu: " + nome.contains("Alu"));  //esse método retorna booleano.


        System.out.println("--------------- | Replaces | ---------------");
        System.out.println(nome);
        System.out.println(outroNome);
        System.out.println(outroNome2);
        System.out.println(outroNome3);
        System.out.println("--------------- | Upper e Lower | ---------------");
        System.out.println(outroNomeLower);
        System.out.println(outroNomeUpper);
        System.out.println("--------------- | Index e Posições | ---------------");
        System.out.println(posicaoLetra); //0:a 1:l 2:u 3:r 4:a
        System.out.println(posicaoIndex);
        System.out.println("--------------- | Substring | ---------------");
        System.out.println(subString);
        System.out.println("-----------------------------------------------");


    }
}
