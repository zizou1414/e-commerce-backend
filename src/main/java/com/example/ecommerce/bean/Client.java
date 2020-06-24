package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firsttName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    @ManyToOne
    private City city;
    @OneToMany(mappedBy = "client")
    private List<Command> commands;

    public Client() {
    }
}
