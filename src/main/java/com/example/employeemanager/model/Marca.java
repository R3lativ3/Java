package com.example.employeemanager.model;

import javax.persistence.*;

@Entity
@Table(name = "MarcaNueva")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMarca")
    private int idMarca;
    private String marcaNueva;

    public Marca(){}
}
