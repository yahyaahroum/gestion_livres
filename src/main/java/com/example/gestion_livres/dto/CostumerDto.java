package com.example.gestion_livres.dto;

import com.example.gestion_livres.model.Costumer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CostumerDto { private Integer id;
    private String lastName;
    private String firstName;
    private String job;
    private String adresse;
    private String email;
    private String login;
    private String password;

    private List<LocationDto> locations;
  private CostumerDto fromEntity(Costumer costumer){
      if (costumer==null){
          return null;
      }else{
          return CostumerDto.builder()
                  .id(costumer.getId())
                  .lastName(costumer.getLastName())
                  .firstName(costumer.getFirstName())
                  .job(costumer.getJob())
                  .adresse(costumer.getAdresse())
                  .email(costumer.getEmail())
                  .login(costumer.getLogin())
                  .password(costumer.getPassword())
                  .build();
      }
  }
  private Costumer toEntity(CostumerDto costumerDto){
      if(costumerDto==null){
          return null;
      }else{
          Costumer costumer=new Costumer();

          costumer.setId(costumerDto.getId());
          costumer.setLastName(costumerDto.getLastName());
          costumer.setFirstName(costumerDto.getFirstName());
          costumer.setJob(costumerDto.getJob());
          costumer.setAdresse(costumerDto.getAdresse());
          costumer.setEmail(costumerDto.getEmail());
          costumer.setLogin(costumerDto.getLogin());
          costumer.setPassword(costumerDto.getPassword());
          return costumer;
      }
  }
}
