package ma.fstt.lab1.dao;

import ma.fstt.lab1.entities.Commande;
import ma.fstt.lab1.service.CommandeRepository;

import java.util.List;

public class CommandeDAO implements CommandeRepository {
    @Override
    public void ajouterCommande(Commande commande) {

    }

    @Override
    public void supprimerCommande(Long id) {

    }

    @Override
    public List<Commande> listerCommandes() {
        return List.of();
    }

    @Override
    public Commande getCommandeById(Long id) {
        return null;
    }
}
