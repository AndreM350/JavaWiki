package Generics;

public class ClasseTeste<T> {

    T objeto;

    public ClasseTeste(T objeto) {
        this.objeto = objeto;
    }

    public void mostraTipo(){  //método para mostrar o tipo de variável
        System.out.println(objeto.getClass().getName());
    }

}
