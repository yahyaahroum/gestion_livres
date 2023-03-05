package com.example.gestion_livres.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="book")
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private Date dateCreation;
    @Column(nullable = false)
    private Long totalExemplaires;
    @Column(nullable = false)
    private String Auteur;
    @ManyToOne
    @JoinColumn(name="id_categorie")
    private Categorie categorie;
    @OneToMany(mappedBy = "book")
    List<Location> locations;
}
