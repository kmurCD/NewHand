package com.nah.newandhand.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "tbl_client")
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idCli;
    private String nam;
    private String lastnam;
    private int  dni;
    private  String mail;
    private  int telf;
    private String Dir;



}
