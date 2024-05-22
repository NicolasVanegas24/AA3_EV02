package com.proyectodbr.prueba.repository;

//Llamado de conexiones con la clase creada en model de Usuarios

import com.proyectodbr.prueba.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    
}
