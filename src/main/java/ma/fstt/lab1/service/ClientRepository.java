package ma.fstt.lab1.service;

import ma.fstt.lab1.entities.Client;

import java.util.List;

public interface ClientRepository {
    void ajouterClient(Client client);
    void supprimerClient(Long id);
    void updateClient(Client client);
    List<Client> listerClients();
    Client getClientById(Long id);
}
