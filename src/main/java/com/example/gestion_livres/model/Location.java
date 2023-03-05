package com.example.gestion_livres.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="location")

public class Location implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="",nullable = false)
    private Date beginDate;
    @Column(name="",nullable = false)
    private Date endDate;
    @ManyToOne
    @JoinColumn(name="id_book")
    private Book book;
  @ManyToOne
  @JoinColumn(name="id_costumer")
    private Costumer costumer;
}
