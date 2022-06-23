package Objetos.Interface;

public class TestaContas {


    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1500);


        ContaPoupanca cp = new ContaPoupanca();
        cp.deposita(2000);

        cc.transfere(500,cp);


        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }

}
