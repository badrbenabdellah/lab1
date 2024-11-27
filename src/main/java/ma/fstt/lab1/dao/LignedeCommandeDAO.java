package ma.fstt.lab1.dao;

import ma.fstt.lab1.entities.LignedeCommande;
import ma.fstt.lab1.service.LignedeCommandeRepository;

import java.util.List;

public class LignedeCommandeDAO implements LignedeCommandeRepository {
    @Override
    public void ajouterLignedeCommande(LignedeCommande lignedeCommande) {

    }

    @Override
    public void supprimerLignedeCommande(Long id) {

    }

    @Override
    public List<LignedeCommande> listerLignedeCommandes() {
        return List.of();
    }

    @Override
    public LignedeCommande getLignedeCommandeById(Long id) {
        return null;
    }
}
