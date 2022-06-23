package TestesGerais;

public class TestaMetodoStatic {

    static int a;
    static int b;

    public static int resultadoSoma(int a, int b){
        return a+b;


    }

    int somar(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {


        int teste1 = resultadoSoma(40, 50);
        System.out.println("Somar via método static da classe: "+teste1);

        System.out.println("------------------");

        TestaMetodoStatic somarInstanciado = new TestaMetodoStatic();

        int teste2 = somarInstanciado.somar(40,50);
        System.out.println("Soma via método do objeto: " + teste2);





    }

}

