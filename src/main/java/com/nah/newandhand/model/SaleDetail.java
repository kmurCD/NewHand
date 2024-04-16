package com.nah.newandhand.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_detailSale")
public class SaleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetail;
    private  int Cant;

    @ManyToOne
    @JoinColumn(name = "idProd")
    private  Product product;
}
