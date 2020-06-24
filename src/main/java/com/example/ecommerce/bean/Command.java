package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Command implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Date commandDate;
    private Date regulationDate;
    private BigDecimal total;
    private CommandeState commandeState;
    @ManyToOne
    private Client client;
    @ManyToOne
    private User admin;
    @ManyToOne
    private User delivery;
    @ManyToOne
    private User validator;
    @OneToMany(mappedBy = "command")
    private List<CommandLine> commandLines;



    public Command() {
    }
}
