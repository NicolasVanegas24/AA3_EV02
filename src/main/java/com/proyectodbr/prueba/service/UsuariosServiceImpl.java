package com.proyectodbr.prueba.service;

//Definir y realizar la logica en cada elemento crud

import com.proyectodbr.prueba.model.Usuarios;
import com.proyectodbr.prueba.repository.UsuariosRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService{
    
    //Solicitud a las dependencias con Autowired
    @Autowired
    private UsuariosRepository usuariosRepository;

    //Crear nuevo usuario
    @Override
    public Usuarios newUsuarios(Usuarios newUsuarios) {
        return usuariosRepository.save(newUsuarios);
    }

    //Ver todos los usuarios
    @Override
    public Iterable<Usuarios> getAll() {
       return this.usuariosRepository.findAll();
    }

    //Modificar usuarios
    @Override
    public Usuarios modifyUsuarios (Usuarios usuarios) {
        Optional<Usuarios> usuariosEncontrado= this.usuariosRepository.findById(usuarios.getIdusu());
        
        if(usuariosEncontrado.get()!=null){
            usuariosEncontrado.get().setNomusu(usuarios.getNomusu());
            usuariosEncontrado.get().setNombres(usuarios.getNombres());
            usuariosEncontrado.get().setCelular(usuarios.getCelular());
            usuariosEncontrado.get().setEmail(usuarios.getEmail());
            usuariosEncontrado.get().setDireccion(usuarios.getDireccion());
            usuariosEncontrado.get().setContraseña(usuarios.getContraseña());            
            return this.newUsuarios(usuariosEncontrado.get());
        }
        
        return null;
    }

    //Eliminar usuario
    @Override
    public Boolean deleteUsuarios(Long idusu) {
       this.usuariosRepository.deleteById(idusu);
       return true;
    }
    
    
}
