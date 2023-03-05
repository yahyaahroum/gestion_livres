package com.example.gestion_livres.dto;
import com.example.gestion_livres.model.Categorie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategorieDto {
    private Integer id;
    private String code;
    private String libelle;
    List<BookDto> books;

    private CategorieDto fromEntity(Categorie categorie){
       if(categorie==null){
           return null;
       }else {
           return CategorieDto.builder()
                   .id(categorie.getId())
                   .code(categorie.getCode())
                   .libelle(categorie.getLibelle())
                   .build();
       }
    }
    private Categorie toEntity(CategorieDto catagorieDto){
        if(catagorieDto==null){
            return null;
        }else{
            Categorie categorie=new Categorie();
            categorie.setId(catagorieDto.getId());
            categorie.setCode(catagorieDto.getCode());
            categorie.setLibelle(catagorieDto.getLibelle());
            return categorie;
        }
    }
}
