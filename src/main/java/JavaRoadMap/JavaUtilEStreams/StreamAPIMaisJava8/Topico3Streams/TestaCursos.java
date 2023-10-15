package JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.Topico3Streams;

import java.util.*;
import java.util.stream.Collectors;

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

        //----------------------------------------------------
        Optional<Cursos> optionalCurso = cursos.stream()
                .filter(cursos1 -> cursos1.getAlunos() >= 100)
                .findAny();

//        System.out.println("-------- print do Optional de curso onde alunos > 100");
//        Cursos curso = optionalCurso.orElse(null);
//        System.out.println(curso.getNome());

        //trocando o métodos acima por algo menor

        System.out.println("-------- print do Optional se for existir && alunos > 100");
        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("-------- Concatenando com somente 1 fluxo de stream");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("-------- Em Map");

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));



    }
}
