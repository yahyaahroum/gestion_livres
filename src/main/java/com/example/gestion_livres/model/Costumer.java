package com.example.gestion_livres.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="costumer")
public class Costumer implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="",nullable = false)
    private String lastName;
    @Column(name="",nullable = false)
    private String firstName;
    @Column(name="",nullable = true)
    private String job;
    @Column(name="",nullable = true)
    private String adresse;
    @Column(name="",nullable = true)
    private String email;
    @Column(name="",nullable = false)
    private String login;
    @Column(name="",nullable = false)
    private String password;
@OneToMany(mappedBy = "costumer")
    private List<Location> locations;
}
