package com.proyectodbr.prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
//tabla de soporte
public class Soporte {
    @Id
    @Column
    private Long idsoporte;
    @Column
    private String fechasoli;
    @Column
    private String descprob;
    @Column
    private String estado;
    @Column
    private String solucion;
    @Column
    private String fecharesolu;
}
