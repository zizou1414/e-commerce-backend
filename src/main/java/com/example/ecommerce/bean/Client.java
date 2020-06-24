package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String tel;
    @ManyToOne
    private Ville ville;
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    public Client() {
    }
}
