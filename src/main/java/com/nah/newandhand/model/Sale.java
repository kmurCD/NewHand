package com.nah.newandhand.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Table(name = "tbl_sale")
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSale;
    private  int nroSale;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date  date;
    double totalSale;
    private  String estado;
    private int idDetail;

}
