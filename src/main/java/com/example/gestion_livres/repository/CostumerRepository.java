package com.example.gestion_livres.repository;

import com.example.gestion_livres.model.Book;
import com.example.gestion_livres.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Costumer,Integer> {
}
