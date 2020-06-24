package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
public class CommandLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal qte;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Command command;

    public CommandLine() {
    }
}
