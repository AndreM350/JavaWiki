package Generics;

public class Main {

    public static void main(String[] args) {

        ClasseTeste<Integer> obj = new ClasseTeste<>(10);
        ClasseTeste<Double> obj2 = new ClasseTeste<>(15.5);
        //A declaração dentro do <> precisa ser um objeto

        obj.mostraTipo();
        obj2.mostraTipo();

        FuncaoNumerica<Integer> objetoQuad =  new FuncaoNumerica<>(4);
        System.out.println(objetoQuad.raizQuadrada());


    }

}
