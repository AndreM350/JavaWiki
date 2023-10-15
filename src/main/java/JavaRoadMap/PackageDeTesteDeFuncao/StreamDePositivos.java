package JavaRoadMap.PackageDeTesteDeFuncao;

import java.util.*;

public class StreamDePositivos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        double n3 = leitor.nextDouble();
        double n4 = leitor.nextDouble();
        double n5 = leitor.nextDouble();
        double n6 = leitor.nextDouble();

        List<Double> listaDeNumeros = Arrays.asList(n1, n2, n3, n4, n5, n6);
        List<Double> numerosPositivos = new ArrayList<>();

        listaDeNumeros.forEach(n -> {
            if (n > 0) {
                numerosPositivos.add(n);
            }
        });

        long nParesDaLista = numerosPositivos.size();

        Double soma = numerosPositivos.stream().reduce((double) 0, Double::sum);
        double v = soma / nParesDaLista;
        System.out.println(nParesDaLista + " valores positivos");
        System.out.println(String.format("%.1f",v));
    }
}