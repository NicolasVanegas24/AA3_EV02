package com.proyectodbr.prueba.service;

//Generación de los servicios crud 

import com.proyectodbr.prueba.model.Usuarios;


public interface UsuariosService {
    
    //Generear nuevo usuario
    Usuarios newUsuarios (Usuarios newUsuarios);
    
    //Obtener todos los datos de infomación
    Iterable<Usuarios> getAll();
    
    //Actualización o modificacion de un usuario
    Usuarios modifyUsuarios (Usuarios Usuarios);
    
    //Borrado de un usuario
    Boolean deleteUsuarios (Long idusu);
}
