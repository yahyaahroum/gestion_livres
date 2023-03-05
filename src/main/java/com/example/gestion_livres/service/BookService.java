package com.example.gestion_livres.service;

import com.example.gestion_livres.model.Book;

import java.util.List;

public interface BookService {
    public Book saveBook(Book book);
    public Book updateBook(Book book,Integer id);
    public void deleteBook(Integer bookId);
    public List<Book> findBytitre(String titre);
    public Book findByisbn(String isbn);
    public Boolean checkIfIdExists(Integer id);
    public List<Book> findByCateforie(String codeCategorie);

}
