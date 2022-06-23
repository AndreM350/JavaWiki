package JPA_HIBERNATE.DAO;

import JPA_HIBERNATE.modelo.Categoria;


import javax.persistence.EntityManager;

public class CategoriaDAO {

    private EntityManager em;

    //injeção de dependência - quem for instanciar uma classe DAO vai ter que passar um EntityManager
    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);

    }

    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }

    public void remover(Categoria categoria) {
        categoria = em.merge(categoria);
        this.em.remove(categoria);

    }
}
