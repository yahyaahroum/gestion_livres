package com.example.gestion_livres.repository;

import com.example.gestion_livres.model.Book;
import com.example.gestion_livres.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
