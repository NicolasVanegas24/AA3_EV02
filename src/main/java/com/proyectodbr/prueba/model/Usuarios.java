package com.proyectodbr.prueba.model;

//Se genera la entidad de la aplicación
//prueba

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Llamado de elementos de las dependecias 
@Entity
@Data
//Creación tabla de usuarios
public class Usuarios {
    
    @Id
    //Generación de entidades
    @Column (name = "Id usuario")
    private Long idusu;
    
    @Column(name="Id usuario", nullable=false, length = 45)
    private String nombres;
    
    @Column (nullable=false, unique = true, length = 45)
    private String email;
    
    @Column (nullable=false, length = 45)
    private String direccion;
    
    @Column (name="Nombre ingreso", unique = true, nullable=false, length = 45)
    private String nomusu;
    
    @Column (nullable=false, length = 45)
    private String celular;
    
    @Column (nullable=false, length = 10)
    private String contraseña;
        
}
