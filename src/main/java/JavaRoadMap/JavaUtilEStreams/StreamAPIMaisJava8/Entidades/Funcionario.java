package JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.Entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    private String nome;
    private int idade;
    private BigDecimal salario;
    private List<Telefone> telefones;

    public Funcionario(String nome, int idade, BigDecimal salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
}
