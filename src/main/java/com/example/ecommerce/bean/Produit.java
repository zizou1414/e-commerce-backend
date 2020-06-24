package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String referenceProduit; //Pr_1
    private String libelleProduit;   //samsung s5
    private BigDecimal prixProduit;
    private int qteStock;
    private String taille;
    private String couleur;
    private BigDecimal poids;
    @OneToMany(mappedBy = "produit")
    private List<LigneCommande> ligneCommandes;
    @ManyToOne
    private Categorie categorie;

    public Produit() {
    }
}
