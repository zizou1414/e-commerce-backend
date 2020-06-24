package com.example.ecommerce.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class CommandLine {

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
