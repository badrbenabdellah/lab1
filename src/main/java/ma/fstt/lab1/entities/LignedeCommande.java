package ma.fstt.lab1.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "LignedeCommande")
public class LignedeCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false )
    private int id;
    @Column(nullable = false )
    private int quantite;
    @Column(nullable = false )
    private float prix_total;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
}
