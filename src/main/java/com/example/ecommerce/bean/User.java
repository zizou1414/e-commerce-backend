package com.example.ecommerce.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String code;
    private String firsttName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private boolean enabled;
    private Role authority;
    @ManyToOne
    private City city;
    @ManyToOne
    private User superAdmin;


    public User() {
    }
}
