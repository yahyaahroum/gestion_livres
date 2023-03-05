package com.example.gestion_livres.repository;

import com.example.gestion_livres.model.Book;
import com.example.gestion_livres.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
