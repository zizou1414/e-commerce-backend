package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomRegion;
    @OneToMany(mappedBy = "region")
    private List<Ville> villes;


    public Region() {
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
}
