package JavaRoadMap.ClasseTesteParaObjetos;

public class testeCofre {

    public static void main(String[] args) {

        Cofre cofre1 = new Cofre();
        Cofre cofre2 = new Cofre();

        cofre1.depositar(1000);
        cofre2.depositar(1000);

        System.out.println("Cofre1 " + cofre1.getSaldo());
        System.out.println("Cofre2 " + cofre2.getSaldo());
        System.out.println("-----------------------------");

        cofre1.transfere(cofre2,500);
        System.out.println("Cofre1 " + cofre1.getSaldo());
        System.out.println("Cofre2 " + cofre2.getSaldo());





    }

}