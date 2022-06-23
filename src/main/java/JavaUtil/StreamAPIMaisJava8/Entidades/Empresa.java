package JavaUtil.StreamAPIMaisJava8.Entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {

    private List<Funcionario> funcionarios;

}
