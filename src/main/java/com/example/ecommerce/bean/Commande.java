package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String referenceCommande;
    private Date dateCommande; // Date à laquelle le vendeur doit livrer les titres que son client a achetés et le client, régler son achat. Il s'agit généralement du troisième jour ouvrable suivant la date de l'opération.
    private Date dateRegelement;
    private BigDecimal total;
    private String etat;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> ligneCommandes;
    @OneToMany(mappedBy = "commande")
    private List<AdminCommande> adminCommandes;
    @OneToMany(mappedBy = "commande")
    private List<ValidateurCommande> validateurCommandes;
    @OneToMany(mappedBy = "commande")
    private List<LivreurCommande> livreurCommandes;

    public Commande() {
    }
}
