package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
public class DeliveryPricing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User livreur;
    @ManyToOne
    private City city;
    private BigDecimal price;

    public DeliveryPricing() {
    }
}
