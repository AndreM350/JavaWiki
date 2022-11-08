package JavaUtilEStreams.StreamAPIMaisJava8.Entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {

    private Long telefoneComercial;
    private Long telefoneResidencial;

}
