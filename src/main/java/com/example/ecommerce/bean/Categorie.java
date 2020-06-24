package com.example.ecommerce.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelleCategorie;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

    public Categorie() {
    }
}
