package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientRepositoryImpl implements ClientRepository {
    @PersistenceContext
    private EntityManager entitymanager;

    @Override
    public void save(Client p) {
        entitymanager.persist(p);
    }

    @Override
    public Client update(Client c) {
        return null;
    }

    @Override
    public void deleteById(long idClient) {

    }

    @Override
    public Client findById(long idClient) {
        return null;
    }

    public ClientRepositoryImpl() {
        System.out.println("creation bean Repository");
    }
}

    //  EntityManagerFactory emf=
    //     Persistence.createEntityManagerFactory("unit_clients");
    // EntityManager em=emf.createEntityManager();

    //@Override
    //  public Client save(Client c) {
    //  em.getTransaction().begin();
    //  em.persist(c);
    //  em.getTransaction().commit();
    // return null;
    //}
    //public ClientRepositoryImpl() { }

/*
    private ClientRepository dao;
    public void setDao(ClientRepository dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client update(Client c) {
        return dao.update(c);
    }
  */
/*
    public List<Client> findAll() {
        List<Client> ListClient = em.createQuery("select e from TClients e").getResultList();
        return ListClient;
    }
*/
    /*
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();

    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        return null;

    }

    public Client update(Client c) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null ;
    }

    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }

    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }

    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

     */


