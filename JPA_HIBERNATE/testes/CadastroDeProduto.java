package JPA_HIBERNATE.testes;

import JPA_HIBERNATE.DAO.CategoriaDAO;
import JPA_HIBERNATE.DAO.ProdutoDAO;
import JPA_HIBERNATE.modelo.Categoria;
import JPA_HIBERNATE.modelo.Produto;
import JPA_HIBERNATE.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {
    public static void main(String[] args) {

        cadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        System.out.println("---------------------------------------------------------- | BUSCA POR ID | --------------------");
        Produto p1 = produtoDAO.buscarPorId(1L);
        System.out.println("O valor do produto P1 é: "+p1.getPreco());


        System.out.println("----------------------------------------------------------------- | BUSCAR TODOS | -------------");
        List<Produto> todos = produtoDAO.buscarTodos();
        todos.forEach(produtoBuscado -> System.out.println(produtoBuscado.getNome()));



        System.out.println("-------------------------------------------------------------------- | BUSCA POR NOME ESPECIFICO | ----------");
        List<Produto> porNomeBuscado = produtoDAO.buscarPorNome("Galaxy Note 10 Plus");
        todos.forEach(porNome -> System.out.println(porNome.getNome()));



        System.out.println("------------------------------------------------------------------- | BUSCA POR NOME DA CATEGORIA | -----------");
        List<Produto> porNomeCategoria = produtoDAO.buscarPorNomeDaCategoria("CELULARES");
        todos.forEach(porNome -> System.out.println(porNome.getNome()));


        System.out.println("------------------------------------------------------------------- | BUSCA RETORNANDO SOMENTE O PREÇO | -----------");
        BigDecimal precoProduto = produtoDAO.buscarPrecoDoProdutoComNome("Galaxy Note 10 Plus");
        System.out.println(precoProduto);


    }

    private static void cadastrarProduto() {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Galaxy Note 10 Plus","Celular com caneta da Samsung",new BigDecimal("3500"), celulares);

        // 1 Na string do persistenceUnitName colocamos o nome da unit do persistence.xml que vai indicar qual banco a JPA vai se conectar

        //Bloco "removido" pela implementação do JPAUtil.getEntityManager();
        //--------------------------------------------------------------------
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("NomePersistenceUnit");
        //EntityManager em = factory.createEntityManager();
        //--------------------------------------------------------------------

        //Passando como parâmetro um EntityManager que faz o acesso ao DB
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        em.getTransaction().begin(); //inicia a transação

        //Método abaixo era utilizado antes da classe ProdutoDAO
        //em.persist(celular); //método para inserir no DB, pelo mapeamento da entidade a JPA saberá em qual tabela inserir este objeto.

        //Para não ter erro de inserção a tabela de categorias precisará estar criada antes de tentar inserir o produto vinculado com a categoria.
        categoriaDAO.cadastrar(celulares);

        //Linhas 29 e 33 tem o mesmo funcionamento basicamente...
        //Com a classe ProdutoDAO utilizamos o método criado lá
        produtoDAO.cadastrar(celular);
        em.getTransaction().commit();  //validar
        em.close(); //fechando o recurso
    }
}
