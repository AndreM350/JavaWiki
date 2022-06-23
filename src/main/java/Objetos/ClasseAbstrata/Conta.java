package Objetos.ClasseAbstrata;

abstract class Conta {

    String nome;

    public Conta(String nome) {
        this.nome = nome;
    }


    public abstract String printaNome();
}
