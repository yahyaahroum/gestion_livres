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
@Table(name="categorie")
public class Categorie implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String libelle;
    @OneToMany(mappedBy = "categorie")
    List<Book> books;
}
