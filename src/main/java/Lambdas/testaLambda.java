package Lambdas;

import java.util.ArrayList;

public class testaLambda {
    public static void main(String[] args) {

        ArrayList<String> listaEstados = new ArrayList<>();

        listaEstados.add("SP");
        listaEstados.add("RJ");
        listaEstados.add("PA");
        listaEstados.add("PB");
        listaEstados.add("AM");

//        for (String estados : listaEstados) {
//            System.out.println(estados);
//
//        }

        //listaEstados.forEach((String) -> System.out.println(listaEstados.size()));
        //nomes.forEach((nome) -> System.out.println(nome));

        listaEstados.forEach((estado) -> System.out.println(estado));




    }
}
