package ma.fstt.lab1.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import ma.fstt.lab1.entities.Client;
import ma.fstt.lab1.service.ClientRepository;

import java.util.List;

@ApplicationScoped
public class ClientDAO implements ClientRepository {

    @PersistenceContext
    EntityManager entityManager;

    public ClientDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myentity");
        this.entityManager = emf.createEntityManager();
    }

    @Override
    public void ajouterClient(Client client) {
        entityManager.getTransaction().begin(); // Démarre la transaction
        entityManager.persist(client);         // Persiste le client
        entityManager.getTransaction().commit(); // Valide la transaction
    }

    @Override
    public void supprimerClient(Long id) {
        Client client = entityManager.find(Client.class, id);
        if (client != null) {
            entityManager.remove(client);
        } else {
            System.out.println("Le client n'existe pas");
        }
    }

    @Override
    public void updateClient(Client client) {
        entityManager.merge(client);
    }

    @Override
    public List<Client> listerClients() {
        List<Client> clients = entityManager.createQuery("SELECT c FROM Client c", Client.class).getResultList();
        System.out.println("Nombre de clients trouvés : " + clients.size());
        for (Client client : clients) {
            System.out.println("Client : " + client);
        }
        return clients;
    }


    @Override
    public Client getClientById(Long id) {
        return entityManager.find(Client.class, id);
    }
}
