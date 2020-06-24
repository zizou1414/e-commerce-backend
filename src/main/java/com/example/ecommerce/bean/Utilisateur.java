package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String code;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String email;
    private boolean active;  //compte bloque ou non
    private Role role;   //admin , validateur , livreur
    @ManyToOne
    private Ville ville;
    @OneToMany(mappedBy = "utilisateur")
    private List<LivreurCommande> livreurCommandes;
    @OneToMany(mappedBy = "utilisateur")
    private List<ValidateurCommande> validateurCommandes;
    @OneToMany(mappedBy = "utilisateur")
    private List<AdminCommande> adminCommandes;

    public Utilisateur() {
    }
}
