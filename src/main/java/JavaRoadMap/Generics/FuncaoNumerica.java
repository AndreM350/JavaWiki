package JavaRoadMap.Generics;

public class FuncaoNumerica<T extends Number> {
//public class FuncaoNumerica<T> { //modelo antigo


    T objeto;

    public FuncaoNumerica(T objeto) {
        this.objeto = objeto;
    }

    public double raizQuadrada(){

        //return objeto * objeto;
        return objeto.intValue() * objeto.intValue(); //converte para int


    }
}
