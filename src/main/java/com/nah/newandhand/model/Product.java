package com.nah.newandhand.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "tbl_product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPro;
    private String nomPro;
    private String des;
    private String color;
    private String tall;
    private  double pre;
    private  int stock;
    private  byte[] img;

    @JoinColumn(name = "idCat")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("categoryId")
    private Category category;

}
