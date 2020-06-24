package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class CategoryProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Product product;

    public CategoryProduct() {
    }
}
