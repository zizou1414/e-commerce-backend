package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class LigneCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String qte;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Commande commande;

    public LigneCommande() {
    }
}
