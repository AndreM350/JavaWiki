package JavaUtilEStreams.StreamAPIMaisJava8.Entidades;

import JavaUtilEStreams.StreamAPIMaisJava8.Topico3Streams.Holding;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestaStreamEmListas {
    public static void main(String[] args) {

        var tel1 = Telefone.builder().telefoneComercial(11111111L).build();
        var tel2 = Telefone.builder().telefoneResidencial(22222222L).build();

        var tel3 = Telefone.builder().telefoneComercial(33333333L).build();
        var tel4 = Telefone.builder().telefoneResidencial(44444444L).build();

        var listaDeTelefones1 = Arrays.asList(tel1, tel2);
        var listaDeTelefones2 = Arrays.asList(tel3, tel4);


        var andre = Funcionario.builder()
                .nome("André")
                .idade(28)
                .salario(new BigDecimal(2000))
                .telefones(listaDeTelefones1).build();

        var amanda = Funcionario.builder()
                .nome("Amanda")
                .idade(29)
                .salario(new BigDecimal(9500))
                .telefones(listaDeTelefones1).build();

        var joao = Funcionario.builder()
                .nome("João")
                .idade(32)
                .salario(new BigDecimal(7500))
                .telefones(listaDeTelefones2).build();

        var pedro = Funcionario.builder()
                .nome("Pedro")
                .idade(35)
                .salario(new BigDecimal(6300))
                .telefones(listaDeTelefones2).build();

        var listaDeFuncionarios = Arrays.asList(amanda, andre);
        var listaDeFuncionarios2 = Arrays.asList(joao, pedro);

        var empresa1 = Empresa.builder()
                .Nome("Empresa1")
                .funcionarios(listaDeFuncionarios).build();

        var empresa2 = Empresa.builder()
                .Nome("Empresa2")
                .funcionarios(listaDeFuncionarios2).build();

        var listaDeEmpresas = Arrays.asList(empresa1, empresa2);

        var holding1 = Holding.builder().nome("Holding1").empresasDoGrupo(listaDeEmpresas).build();

        //telefone dos funcionarios da empresa1

        List<Long> telefones = holding1.getEmpresasDoGrupo().stream()
                .filter(empresa -> empresa.getNome().equals("Empresa1"))
                .map(Empresa::getFuncionarios)
                .findAny().orElseThrow(RuntimeException::new)
                .stream()
                .map(Funcionario::getTelefones)
                .findAny().orElseThrow(RuntimeException::new)
                .stream()
                .map(Telefone::getTelefoneComercial).toList();


        System.out.println(telefones);

    }
}
