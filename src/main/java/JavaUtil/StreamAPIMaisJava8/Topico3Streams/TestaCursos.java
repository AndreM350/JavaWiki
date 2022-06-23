package JavaUtil.StreamAPIMaisJava8.Topico3Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCursos {
    public static void main(String[] args) {

        List<Cursos> cursos = new ArrayList<>();
        cursos.add(new Cursos("Python", 45));
        cursos.add(new Cursos("Javascript", 150));
        cursos.add(new Cursos("Java 8", 113));
        cursos.add(new Cursos("C", 55));

        cursos.sort(Comparator.comparing(c -> c.getAlunos())); //ou
        cursos.sort(Comparator.comparing(Cursos::getAlunos));

        cursos.forEach(System.out::println); //no method reference não será possível printa um getNome()
        //nesse caso precisamos passsar para lambda
        System.out.println("------------------------");
        cursos.forEach(c -> System.out.println(c.getNome()));

        // FILTERS --- imprimir cursos com mais de 100 Alunos
        // Os métodos de filtros além de outros ficaram dentro da classe stream()

        // TODO > TODAS AS ALTERAÇÕES REALIZADAS EM UM STREAM NÃO INTERFEREM NA COLLECTION ORIGINAL ITERADA

        System.out.println("-------- print do stream de cursos onde getAlunos() >= 100 ");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.getNome()));

        //map()

        System.out.println("-------- print do total de alunos onde: getAlunos() >= 100 ");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(c -> c.getAlunos())
                .forEach(total -> System.out.println(total));

        System.out.println("-------- print do total somado de alunos onde: getAlunos() >= 100 ");
        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Cursos::getAlunos).sum();
        System.out.println(soma);

    }
}
