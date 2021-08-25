package com.example.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCategoria;
    private String categoriaNueva;

    @OneToMany(mappedBy = "categoria")
    List<Producto> productoList;

    public Categoria(){}

    public Categoria(String categoria){
        this.categoriaNueva = categoria;
    }

    public int getIdCategoria(){
        return this.idCategoria;
    }

    public String categoria(){
        return this.categoriaNueva;
    }
}
