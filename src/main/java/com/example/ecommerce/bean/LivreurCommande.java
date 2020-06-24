package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class LivreurCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Utilisateur utilisateur;
    private Date dateEnvoie;  //date de reception de la commande par le livreur.
    private  Date dateLivraison ;

    public LivreurCommande() {
    }
}
