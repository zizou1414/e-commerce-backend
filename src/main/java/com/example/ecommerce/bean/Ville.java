package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ville implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomVille;
    private String codePostal;
    @ManyToOne
    private Region region;

    public Ville() {
    }
}
