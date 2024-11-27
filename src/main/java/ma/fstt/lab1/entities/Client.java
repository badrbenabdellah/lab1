package ma.fstt.lab1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilisation de IDENTITY pour auto-incrémentation
    @Column(nullable = false)
    private int id;

    @Column(nullable = false, length = 255)
    private String firstName;

    @Column(nullable = false, length = 255)
    private String lastName;

    @Column(nullable = false, length = 255, unique = true) // Ajout de contrainte unique pour les emails
    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes;
}
