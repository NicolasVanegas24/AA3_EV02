package com.proyectodbr.prueba.controller;

//Llamado de metodos para la comunicacion con la WEB

import com.proyectodbr.prueba.model.Usuarios;
import com.proyectodbr.prueba.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    
    @Autowired
    private UsuariosService usuariosService;
    
    //Se usa PostMapping ya que el usuaro va a ingresar informacioón
    @PostMapping("/nuevo")
    public Usuarios newUsuarios(@RequestBody Usuarios newUsuarios){
       return this.usuariosService.newUsuarios(newUsuarios);
    }
    
    //Se usa GetMapping para obtener una respuesta
    @GetMapping("/mostrar")
    public Iterable<Usuarios> getAll(){
        return usuariosService.getAll();
    }
    
    //
    @PostMapping("/modificar")
    public Usuarios updateUsuarios(@RequestBody Usuarios usuarios){
        return this.usuariosService.modifyUsuarios(usuarios);
    }
    
    @PostMapping(value="/{id}")
    public Boolean deleteUsuarios(@PathVariable(value="id") Long id){
        return this.usuariosService.deleteUsuarios(id);
    }
}
