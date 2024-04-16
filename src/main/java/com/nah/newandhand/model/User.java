package com.nah.newandhand.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
@Table(name = "tbl_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUs;
    private String us;
    private String psw;
    private String mail;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date  fCre;



}
