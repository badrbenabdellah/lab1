package ma.fstt.lab1.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import ma.fstt.lab1.entities.Client;
import ma.fstt.lab1.entities.Produit;
import ma.fstt.lab1.service.ProduitRepository;

import java.util.List;


@ApplicationScoped
public class ProduitDAO implements ProduitRepository {

    @PersistenceContext
    EntityManager entityManager;

    public ProduitDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myentity");
        this.entityManager = emf.createEntityManager();
    }
    @Override
    public void ajouterProduit(Produit produit) {
        entityManager.getTransaction().begin(); // Démarre la transaction
        entityManager.persist(produit);         // Persiste le client
        entityManager.getTransaction().commit(); // Valide la transaction
    }

    @Override
    public void supprimerProduit(Long id) {
        Produit produit = entityManager.find(Produit.class, id);
        if (produit != null) {
            entityManager.remove(produit);
        } else {
            System.out.println("Le Produit n'existe pas");
        }
    }

    @Override
    public List<Produit> listerProduits() {
        List<Produit> produits = entityManager.createQuery("SELECT p FROM Produit p", Produit.class).getResultList();
        System.out.println("Nombre de produits trouvés : " + produits.size());
        for (Produit produit : produits) {
            System.out.println("Produit : " + produit);
        }
        return produits;
    }

    @Override
    public Produit getProduitById(Long id) {
        return entityManager.find(Produit.class, id);
    }
}
