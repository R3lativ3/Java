package com.example.employeemanager.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrden")
    private int idOrden;
    private LocalDateTime fechaOrden;
    @ManyToOne // muchos clientes pueden aparecer una vez
    @JoinColumn(name = "idCliente", nullable = false)
    Cliente cliente;
    @ManyToOne // muchos estados pueden aparecer una vez
    @JoinColumn(name = "idEstadoOrden", nullable = false)
    EstadoOrden estadoOrden;

    public Orden(){}
}
