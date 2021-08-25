package com.example.employeemanager.models;

import javax.persistence.*;

@Entity
@Table(name="estadoOrdenes")
public class EstadoOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstadoOrden")
    private int idEstadoOrden;
    String estadoOrden;

    public EstadoOrden(){

    }
}
