package com.bank.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 15)
    private String name;

    @Column(name = "lastName", length = 15)
    private String lastName;

    @Column(name = "email", length = 30, unique = true)
    private String email;

    @Column(name = "password", length = 75)
    private String password;

    @OneToOne
    private Role role;
}
