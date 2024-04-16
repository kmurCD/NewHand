package com.nah.newandhand.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "tbl_category")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String namCat;
    private String des;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
