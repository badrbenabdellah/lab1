package ma.fstt.lab1.service;

import ma.fstt.lab1.entities.Produit;

import java.util.List;

public interface ProduitRepository {
    void ajouterProduit(Produit client);
    void supprimerProduit(Long id);
    List<Produit> listerProduits();
    Produit getProduitById(Long id);
}
