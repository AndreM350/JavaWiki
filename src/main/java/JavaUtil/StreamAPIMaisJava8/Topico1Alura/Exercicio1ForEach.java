package JavaUtil.StreamAPIMaisJava8.Topico1Alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio1ForEach {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        /*Agora imprima cada uma dessas Strings com o novo método default, o forEach.*/

        palavras.forEach(System.out::println);

        /*
        Ordene essa lista de Strings que criamos no exercício anterior utilizando o tamanho da String como critério de comparação.
        Lembre-se que você vai usar o default method sort, existente na própria lista.
        Isto é, passe um new Comparator para o palavras.sort() antes de fazer o seu forEach.
        */
        System.out.println("------------- Ordenando com .sort passando um comparator");

        Comparator<String> comparadorTam = new ComparadorDeStringPorTamanho();
        palavras.sort(comparadorTam);
        palavras.forEach(System.out::println);














    }

    static class ComparadorDeStringPorTamanho implements Comparator<String> {
        public int compare(String s1, String s2) {
            if(s1.length() < s2.length())
                return -1;
            if(s1.length() > s2.length())
                return 1;
            return 0;
            // ou >>>> return Integer.compare(s1.length(), s2.length());
        }
    }


}
