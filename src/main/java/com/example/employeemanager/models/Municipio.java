package com.example.employeemanager.models;

import javax.persistence.*;

@Entity
@Table(name = "municipios")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMunicipio;
    private String nombreMunicipio;

    public Municipio(){}

}
