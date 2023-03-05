package com.example.gestion_livres.service.ServiceImpl;

import com.example.gestion_livres.model.Book;
import com.example.gestion_livres.repository.BookRepository;
import com.example.gestion_livres.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book saveBook(Book book) {
        if (book==null){
            return null;
        }else {
            return bookRepository.save(book);
        }
    }

    @Override
    public Book updateBook(Book book,Integer id) {
        if (book==null){
            return null;
        }else {
            Optional<Book> bookTemp = bookRepository.findById(id);
            if (bookTemp.isPresent()) {
                book.setId(id);
                return bookRepository.save(book);
            }
            return null;
        }
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public List<Book> findBytitre(String titre) {
        return null;
    }

    @Override
    public Book findByisbn(String isbn) {
        return null;
    }

    @Override
    public Boolean checkIfIdExists(Integer id) {
        return null;
    }

    @Override
    public List<Book> findByCateforie(String codeCategorie) {
        return null;
    }
}
