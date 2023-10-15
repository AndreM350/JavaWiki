package JavaRoadMap.AulaObjetos;

public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Personagem();

        String nome = "Java";

        System.out.println(p1.getClass());
        System.out.println(nome.getClass());

        p1.nome = "";

    }
}
