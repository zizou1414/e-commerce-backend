package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String postcode;


    public City() {
    }
}
