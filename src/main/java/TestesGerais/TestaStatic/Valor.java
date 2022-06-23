package TestesGerais.TestaStatic;

public class Valor {

    private static int valor = 0;
    //private int valor = 0;
    private int numero;

    public Valor() {
        valor++;
        System.out.println("Valor atual é: " + valor);
    }

    public static int raizQ(int v1){
        return v1*v1;
    }

    public static int getValor() {
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    //----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Valor valor1 = new Valor();
        Valor valor2 = new Valor();
        Valor valor3 = new Valor();
        Valor valor4 = new Valor();

        System.out.println("O valor final static da classe VALOR é: " + Valor.getValor());

        System.out.println("---------------------------------------------");

        valor1.setNumero(20);

        int raizq1 = raizQ(2); //só funciona dessa forma se for método estático.
        System.out.println(raizq1);

    }

}
