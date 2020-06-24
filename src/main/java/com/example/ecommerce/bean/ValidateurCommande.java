package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ValidateurCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Utilisateur utilisateur;
    private Date dateReception; //date de reception de commande par le validateur
    private Date dateEnvoie;  //date d'envoie au livreur

    public ValidateurCommande() {
    }
}
