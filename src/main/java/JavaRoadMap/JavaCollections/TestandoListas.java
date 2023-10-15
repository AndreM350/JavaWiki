package JavaRoadMap.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de Listas";
        String aula2 = "Modelando a classe de Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);


        //removendo itens da lista
        //aulas.remove(0);

        System.out.println("------------------------------------------- ForEach");
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }


        System.out.println("------------------------------------------- For com index");
        for (int i = 0; i < aulas.size() ; i++) {
            System.out.println("Aula: "+ aulas.get(i));
        }

        System.out.println("------------------------------------------- For com lambda");
        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");

        //ORDENAÇÃO PADRÃO -> ORDEM ALFABÉTICA
        Collections.sort(aulas);

        System.out.println("------------------------------------------- Após classificar com o Collections.sort");
        System.out.println(aulas);

    }


}
