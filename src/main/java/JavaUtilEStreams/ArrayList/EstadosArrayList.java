package JavaUtilEStreams.ArrayList;

import java.util.ArrayList;

public class EstadosArrayList {
    public static void main(String[] args) {

        ArrayList<String> estados = new ArrayList<>(); //generics = <String> ou <TipoObjeto>

        estados.add("PA");
        estados.add("SP");
        estados.add("RJ");

        for (String sigla: estados             ) {
            System.out.println(sigla);

        }


    }
}
