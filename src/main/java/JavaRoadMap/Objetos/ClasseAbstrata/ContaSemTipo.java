package JavaRoadMap.Objetos.ClasseAbstrata;

public class ContaSemTipo extends Conta {


    public ContaSemTipo(String nome) {
        super(nome);
    }


    @Override
    public String printaNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ContaSemTipo{" +
                "nome='" + nome + '\'' +
                '}';
    }


}
