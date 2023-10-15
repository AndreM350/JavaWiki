package JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.Topico3Streams;

import JavaRoadMap.JavaUtilEStreams.StreamAPIMaisJava8.Entidades.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Holding {

    private String nome;
    private List<Empresa> empresasDoGrupo;

}
