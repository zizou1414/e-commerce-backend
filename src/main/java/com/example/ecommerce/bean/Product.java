package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String label;
    private BigDecimal price;
    private int qteStock;
    private String size;
    private String color;
    private BigDecimal weigt;
    @OneToMany(mappedBy = "product")
    private List<CommandLine> commandLines;



    public Product() {
    }
}
