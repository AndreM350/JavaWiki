package JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.StreamSortEFilter;

import JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.Entidades.EntidadeTeste;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestaStreamSortEFilter {

    public static void main(String[] args) {

        List<EntidadeTeste> listaDeFuncionarios = Arrays.asList(

                new EntidadeTeste(1L,"André1",15),
                new EntidadeTeste(8L,"Henry8",41),
                new EntidadeTeste(3L,"Pedro3",23),
                new EntidadeTeste(7L,"Gian7",37),
                new EntidadeTeste(5L,"Wellington5",31),
                new EntidadeTeste(6L,"Fábio6",35),
                new EntidadeTeste(2L,"Joao2",18),
                new EntidadeTeste(4L,"Xavier4",26)
        );

        List<EntidadeTeste> listaClassificada = listaDeFuncionarios.stream()
                .filter(e -> e.getId() > 5L)
                .sorted(Comparator.comparingLong(EntidadeTeste::getId)).toList();

        List<EntidadeTeste> listaClassificadaFuncaoManual = listaDeFuncionarios.stream()
                .sorted((e1, e2) -> e1.getIdade() - e2.getIdade()).toList();

        List<EntidadeTeste> listaClassificadaFuncaoManualNome = listaDeFuncionarios.stream()
                .sorted((e1, e2) -> e1.getNome().compareTo(e2.getNome())).toList();

        /* List<User> sortedList = users.stream()
		.sorted((o1, o2) -> o1.getAge() - o2.getAge())
		.collect(Collectors.toList());*/



        System.out.println("  ------------------  LISTA ORIGINAL  ------------------  ");
        listaDeFuncionarios.forEach(System.out::println);

        System.out.println("\n  ------------------  LISTA CLASSIFICADA MANUAL [IDADE] ------------------  ");
        listaClassificadaFuncaoManual.forEach(System.out::println);

        System.out.println("\n  ------------------  LISTA CLASSIFICADA COMPARATOR [IDADE]  ------------------  ");
        listaClassificada.forEach(System.out::println);

        System.out.println("\n  ------------------  LISTA CLASSIFICADA COMPARATOR [NOME] ------------------  ");
        listaClassificadaFuncaoManualNome.forEach(System.out::println);



    }
}
