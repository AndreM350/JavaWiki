package JavaUtilEStreams.StreamAPIMaisJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste1MAP {

    public static void main(String[] args) {

        //Método com foreach normal
        List<String> listaLower = Arrays.asList("a", "b", "c", "d");

        List<String> listaToUpper = new ArrayList<>();

        for (String itemNaLista :listaLower){
            listaToUpper.add(itemNaLista.toUpperCase());
        }

        System.out.println(listaLower);
        System.out.println(listaToUpper);


        //Método com Java 8
        System.out.println("Com Java 8 -----------");
        List<String> collect = listaLower.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> collect1 = numeros.stream().map(n -> n * 2).collect(Collectors.toList());
        numeros.stream().map(numbers-> numbers* 5 ).forEach(saida-> System.out.print(saida + " "));
        System.out.println(collect1);


    }

}
