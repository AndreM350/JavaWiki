package JavaUtil.StreamAPI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreamFilter {

    public static void main(String[] args) {

        var joao2 = Funcionario.builder()
                .nome("Joao")
                .idade(15)
                .salario(new BigDecimal(3000))
                .build();

        Funcionario Joao = new Funcionario("Joao", 15, new BigDecimal(1500));
        Funcionario Maria = new Funcionario("Maria", 25, new BigDecimal(1500));
        Funcionario Pedro = new Funcionario("Pedro", 35, new BigDecimal(1500));

        ArrayList<Funcionario> funcionariosLote1 = new ArrayList<>();
        funcionariosLote1.add(Joao);
        funcionariosLote1.add(Maria);
        funcionariosLote1.add(Pedro);

        Empresa emp1 = new Empresa();
        emp1.setFuncionarios(funcionariosLote1);


        List<Funcionario> listaMais18 = funcionariosLote1.stream()
                .filter(funcionario -> funcionario.getIdade() > 18)
                .collect(Collectors.toList());

        listaMais18.forEach(funcionario -> System.out.println(funcionario.getNome()));

        System.out.println("------------------------------");

        List<Funcionario> listaMaria = funcionariosLote1.stream()
                .filter(funcionario -> funcionario.getNome().equals("Maria"))
                .collect(Collectors.toList());

        listaMaria.forEach(funcionario -> System.out.println(funcionario.getNome()));

        System.out.println(joao2.getNome());

    }


}

