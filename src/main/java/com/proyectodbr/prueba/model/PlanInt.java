package com.proyectodbr.prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
//Creación tabla de planes de internet
public class PlanInt {
   
    @Id
    @Column
    private Long idplanint;
    @Column
    private String nombreplan;
    @Column
    private String velocidad;
    @Column
    private String descripcion;
    @Column
    private String precio;
}
