package JPA_HIBERNATE.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//Classe com objetivo de isolar a criação do EntityManager
public class JPAUtil {

    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("NomePersistenceUnit");

    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();

    }


}
