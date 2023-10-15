package JavaRoadMap.Objetos.Interface;

public class ContaCorrente implements Conta{

    public double saldo;


    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transfere(double valorDaTransferencia, Conta contaDestino) {
        this.saldo = saldo - valorDaTransferencia;
        contaDestino.deposita(valorDaTransferencia);


    }


}
