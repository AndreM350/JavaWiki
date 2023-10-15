package JavaRoadMap.ClasseTesteParaObjetos;

public class Cofre {

    int saldo;

    public void saque(int valorASacar) {
        this.saldo -= valorASacar;
    }

    public void depositar(int valorADepositar) {
        this.saldo += valorADepositar;
    }

    public void transfere(Cofre refDestino, int valorATransferir) {
        if(valorATransferir <=this.saldo) {
            this.saque(valorATransferir);
            refDestino.depositar(valorATransferir);
        } else {
            System.out.println("Transfer?ncia n?o realizada: Saldo insuficiente");
        }


    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}