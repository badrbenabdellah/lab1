package ma.fstt.lab1.service;

import ma.fstt.lab1.entities.LignedeCommande;

import java.util.List;

public interface LignedeCommandeRepository {
    void ajouterLignedeCommande(LignedeCommande lignedeCommande);
    void supprimerLignedeCommande(Long id);
    List<LignedeCommande> listerLignedeCommandes();
    LignedeCommande getLignedeCommandeById(Long id);
}
