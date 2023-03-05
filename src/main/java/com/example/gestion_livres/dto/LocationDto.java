package com.example.gestion_livres.dto;
import com.example.gestion_livres.model.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto {  private Integer id;
    private Date beginDate;
    private Date endDate;
    private BookDto book;
    private  CostumerDto costumer;

    public static LocationDto fromEntity(Location location){
        if(location==null){
            return null;
        }else{
           return  LocationDto.builder()
                   .id(location.getId())
                   .beginDate(location.getBeginDate())
                   .endDate(location.getEndDate())
                  // .costumer(LocationDto.fromEntity(location.c))
                   //.book
                   .build();
        }
    }
private Location toEntity(LocationDto locationDto){
        if(locationDto==null){
            return null;
        }else{
            Location location=new Location();
            location.setId(locationDto.getId());
            location.setBeginDate(locationDto.getBeginDate());
            location.setEndDate(locationDto.getEndDate());
           //location.setCostumer();
         //   location.setBook(toEntity(locationDto.getBook()));
            return location;
        }
}
}
