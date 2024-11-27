package ma.fstt.lab1.service;


import ma.fstt.lab1.entities.Commande;

import java.util.List;

public interface CommandeRepository {
    void ajouterCommande(Commande commande);
    void supprimerCommande(Long id);
    List<Commande> listerCommandes();
    Commande getCommandeById(Long id);
}
