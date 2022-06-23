package JPA_HIBERNATE.modelo;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

//Mapeamento de entidade > classe que representa uma tabela no DB
//Feito através da anotação @Entity
//Por padrão a JPA entende que o nome da tabela é o mesmo nome da classe, para mudar precisa anotar com o @Table onde >
//@Table(name = "nome-da-tabela-no-banco-de-dados")
@Entity
@Table(name = "produtos")
public class Produto {

    @Id //<<<<<<<<< Anotação de vínculo de chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    //Caso o atributo tenha um nome diferente do nome da coluna do DB precisamos utilizar a anotação @Column(name = "Nome-da-Coluna)"
    //@Column(name = "desc")  Ex: Quero meu atributo com nome descricao mas a coluna do DB chama desc
    private String descricao;
    private BigDecimal preco;
    private LocalDate dataCadastro = LocalDate.now();

    //------------- | CATEGORIA SENDO UM ENUM | -------------
    //Categoria é um ENUM, por padrão a JPA mapeia os dados de enum como INT e salva na tabela a posição do ENUM (Ex: CELULAR seria 1)
    //Mapeando pelo nome do ENUM >>> @Enumerated(EnumType.STRING)
    //@Enumerated(EnumType.STRING)
    //private Categoria categoria;
    //------------- | CATEGORIA SENDO UM ENUM | -------------


    //------------- | CATEGORIA SENDO UMA ENTIDADE COM RELACIONAMENTO NO DB | -------------
    //A JPA detecta que Categoria é um tipo entidade e precisaremos especificar a cardinalidade desse link
    //Produtos --> Categoria : MUITOS PARA UM ( * , 1 )
    //Um produto tem uma única categoria, mas uma categoria pode ter muitos produtos.
    @ManyToOne
    private Categoria categoria;


    //CONSTRUTORES --------------------------------------------

    public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto() {
    }

    //GETTER E SETTERS ----------------------------------------

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
