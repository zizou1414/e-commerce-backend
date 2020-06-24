package com.example.ecommerce.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String label;


    public Category() {
    }
}
