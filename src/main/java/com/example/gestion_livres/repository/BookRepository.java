package com.example.gestion_livres.repository;

import com.example.gestion_livres.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
