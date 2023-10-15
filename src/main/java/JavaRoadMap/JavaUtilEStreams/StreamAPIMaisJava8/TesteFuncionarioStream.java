package JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8;

import JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.Entidades.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteFuncionarioStream {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("André",28,new BigDecimal("2500")),
                new Funcionario("Amanda",29,new BigDecimal("4500")),
                new Funcionario("João",32,new BigDecimal("6500"))
        );

        //Com foreach normal
        List<String> listaDeNomes = new ArrayList<>();
        for (Funcionario cadaFunncionario: funcionarios){
            listaDeNomes.add(cadaFunncionario.getNome());
        }
        System.out.println("--1--");
        System.out.println(funcionarios);
        System.out.println("--2--");
        System.out.println(listaDeNomes);

        //Com Java8 Stream com lambda
        List<String> collect = funcionarios.stream().map(x -> x.getNome()).collect(Collectors.toList());
        System.out.println(collect);

        //Java 8 Sem lambda
        funcionarios.forEach( funcionario -> funcionario.setNome("ola") );
        System.out.println("------ > Aqui o nome de todos os funcionários foi trocado");
        List<String> collectNome = funcionarios.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());

        List<BigDecimal> collectSalario = funcionarios.stream()
                .map(Funcionario::getSalario)
                .collect(Collectors.toList());

        List<Integer> collectIdade = funcionarios.stream()
                .map(Funcionario::getIdade)
                .collect(Collectors.toList());



        double sum = funcionarios.stream().mapToDouble(f -> f.getSalario().doubleValue()).sum();
        System.out.println("A soma de todos os salários é: R$" + sum);

        System.out.println(collectNome);
        System.out.println(collectSalario);
        System.out.println(collectIdade);

    }
}
