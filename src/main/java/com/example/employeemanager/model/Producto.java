package com.example.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ProductoNuevo")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nombre;
    private Date fechaCreacion;

    @ManyToOne()
    @JoinColumn(name = "idCategoria", nullable = true)
    Categoria categoria;

    @ManyToOne()
    @JoinColumn(name = "idMarca", nullable = true)
    Marca marca;

    public Producto(){}

    public Producto(String nombre, Categoria categoria, Marca marca){
        this.nombre = nombre;
        this.fechaCreacion = new Date();
        this.categoria = categoria;
        this.marca = marca;
    }
}
