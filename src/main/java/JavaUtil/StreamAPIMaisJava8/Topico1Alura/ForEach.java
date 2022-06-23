package JavaUtil.StreamAPIMaisJava8.Topico1Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ForEach {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        System.out.println("-------------------------------------------------------------------- >>> 1");

        Collections.sort(palavras);
        System.out.println(palavras);

        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        Collections.sort(palavras, comparador);

        System.out.println("-------------------------------------------------------------------- >>> 2");
        System.out.println(palavras);

        //A partir do Java8 o sort virou método estático da List, LIST.SORT(COMPARATOR)
        Comparator<String> comparador2 = new ComparadorDeStringPorTamanho();
        palavras.sort(comparador2);

        System.out.println("-------------------------------------------------------------------- >>> 3 Impressão do forEach com Lambda");
        //Agora com lambda e mudança de parâmetros
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //ou >>> palavras.sort(Comparator.comparingInt(String::length));
        System.out.println(palavras);


        System.out.println("-------------------------------------------------------------------- >>> 4 Impressão do forEach");
        for (String p : palavras) {
            System.out.println(p);
        }

        System.out.println("-------------------------------------------------------------------- >>> 5 Impressão do Consumer");
        Consumer<String> consumidor = new imprimeNaLinha();
        palavras.forEach(consumidor);

        //agora com Lambda

        System.out.println("-------------------------------------------------------------------- >>> 6 Impressão da Iteração com Lambda");
        palavras.forEach((String s) -> {
            System.out.println(s);
        });


        System.out.println("-------------------------------------------------------------------- >>> 7 Impressão da Iteração com Lambda menor ainda");
        palavras.forEach(s -> System.out.println(s));
        //ou >>> palavras.forEach(System.out::println);

        //Consumer<String> impressor = s -> System.out.println(s);
        //palavras.forEach(impressor);

        System.out.println(" - - - Method reference - - - ");

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        Function<String,Integer> funcao = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return  s.length();
            }
        };

        Function<String,Integer> funcao2 = String::length;      //equivalente da função da L69
        Function<String,Integer> funcao3 = s -> s.length();     //equivalente da função da L69

        Comparator<String> comparadorF = Comparator.comparing(funcao);
        palavras.sort(comparadorF);


    }







    /* Os trechos abaixo podem ser substituidos por Lambdas dentro das funções acima */

    static class imprimeNaLinha implements Consumer<String> {

        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }


    static class ComparadorDeStringPorTamanho implements Comparator<String> {
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        }
    }


}


