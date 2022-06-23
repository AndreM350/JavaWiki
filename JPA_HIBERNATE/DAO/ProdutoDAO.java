package JPA_HIBERNATE.DAO;

import JPA_HIBERNATE.modelo.Produto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class ProdutoDAO {

    private EntityManager em;

    //injeção de dependência - quem for instanciar uma classe DAO vai ter que passar um EntityManager
    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Produto produto){
        this.em.persist(produto);
    }

    public Produto buscarPorId(Long id){
        return em.find(Produto.class, id);
    }

    public List<Produto> buscarTodos(){
        String jpql = "SELECT p FROM Produto p ";
        return em.createQuery(jpql, Produto.class).getResultList();
        //createQuery só criar a query
        //getResultList é que dispara a lista
    }

    //named parameter
    public List<Produto> buscarPorNome(String nome){
        String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(jpql, Produto.class)
                .setParameter("nome",nome) //substitui na query o parâmetro passado na classe
                .getResultList();
        //createQuery só criar a query
        //getResultList é que dispara a lista
    }


    //parâmetro posicional
    public List<Produto> buscarPorNome2(String nome){
        String jpql = "SELECT p FROM Produto p WHERE p.nome = ?1";
        return em.createQuery(jpql, Produto.class)
                .setParameter("1",nome) //substitui na query o parâmetro passado na classe
                .getResultList();
        //createQuery só criar a query
        //getResultList é que dispara a lista
    }

    public List<Produto> buscarPorNomeDaCategoria(String nome){
        String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome";
        return em.createQuery(jpql, Produto.class)
                .setParameter("nome",nome) //substitui na query o parâmetro passado na classe
                .getResultList();
        //createQuery só criar a query
        //getResultList é que dispara a lista
    }

    public BigDecimal buscarPrecoDoProdutoComNome(String nome){
        String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(jpql, BigDecimal.class)
                .setParameter("nome",nome) //substitui na query o parâmetro passado na classe
                .getSingleResult();
        //createQuery só criar a query
        //getResultList foi trocado pelo getResultList pois precisamos retornar somente 1 resultado e não uma lista de objetos.
    }



}
