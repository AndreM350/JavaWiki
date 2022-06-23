package Objetos.Interface;

public interface Conta {

    void deposita(double valor);
    void sacar(double valor);
    void transfere(double valorDaTransferencia, Conta contaDestino);
    double getSaldo();


}
