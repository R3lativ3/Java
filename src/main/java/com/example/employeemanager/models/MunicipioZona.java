package com.example.employeemanager.models;

import javax.persistence.*;

@Entity
@Table(name = "municipioZonas")
public class MunicipioZona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMunicipioZona;
    private int zona;
    @ManyToOne()
    @JoinColumn(name = "idMunicipio", nullable = false)
    Municipio municipio;

    public MunicipioZona(){}
}
