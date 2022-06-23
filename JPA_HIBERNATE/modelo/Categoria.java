package JPA_HIBERNATE.modelo;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {


    @Id //<<<<<<<<< Anotação de vínculo de chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }
}
