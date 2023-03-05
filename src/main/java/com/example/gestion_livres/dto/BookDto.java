package com.example.gestion_livres.dto;
import com.example.gestion_livres.model.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    private Integer id;
    private String isbn;
    private String titre;
    private Date dateCreation;
    private Long totalExemplaires;
    private String Auteur;
    private CategorieDto categorie;
    List<LocationDto> locations;

    private BookDto fromEntity(Book book){
        if(book==null){
            return null;
        }else {
            return BookDto.builder()
                    .id(book.getId())
                    .isbn(book.getIsbn())
                    .titre(book.getTitre())
                    .dateCreation(book.getDateCreation())
                    .totalExemplaires(book.getTotalExemplaires())
                    .Auteur(book.getAuteur())
                    //categorie
                    .build();
        }
    }
    private Book toEntity(BookDto bookDto){
        if (bookDto==null){
            return null;
        }else{


        Book book=new Book();
        book.setId(bookDto.getId());
        book.setIsbn(bookDto.getIsbn());
        book.setAuteur(bookDto.getAuteur());
        book.setTitre(bookDto.getTitre());
        book.setDateCreation(bookDto.dateCreation);
        book.setTotalExemplaires(bookDto.getTotalExemplaires());
       // book.setCategorie(bookDto.categorie.);
        return book;
        }
    }
}
