package ma.fstt.lab1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false )
    private int id;
    @Column(nullable = false )
    private String nom;
    @Column(nullable = false )
    private int prix;
    @Column(nullable = false )
    private int stock;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private List<LignedeCommande> lignes;
}
