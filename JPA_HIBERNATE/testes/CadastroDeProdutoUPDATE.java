package JPA_HIBERNATE.testes;

import JPA_HIBERNATE.DAO.CategoriaDAO;
import JPA_HIBERNATE.DAO.ProdutoDAO;
import JPA_HIBERNATE.modelo.Categoria;
import JPA_HIBERNATE.modelo.Produto;
import JPA_HIBERNATE.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProdutoUPDATE {
    public static void main(String[] args) {

        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Galaxy Note 10 Plus","Celular com caneta da Samsung",new BigDecimal("3500"), celulares);


        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        em.getTransaction().begin();
        em.persist(celulares);           //modificações após o persist são monitoradas pela JPA
        celulares.setNome("XPTO");       //Nesse ponto da execução será gerado uma query de update no banco devido ao setNome que modificou o atributo

        em.flush();
        em.clear();

        em.merge(celulares);
        celulares.setNome("1234");
        em.flush();
        em.remove(celulares);
        em.flush();
    }
}
