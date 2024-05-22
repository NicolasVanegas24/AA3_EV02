package com.proyectodbr.prueba.controller;

import com.proyectodbr.prueba.model.Soporte;
import com.proyectodbr.prueba.service.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soporte")
public class SoporteController {
    
    @Autowired
    private SoporteService sopoService;
    
    @PostMapping("/nuevo")
    public Soporte newsoSoporte(@RequestBody Soporte newSoporte){
        return this.sopoService.newSoporte(newSoporte);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Soporte> getAll(){
        return sopoService.getAll();
    }
    
    @PostMapping("/modificar")
    public Soporte updatSoporte(@RequestBody Soporte soporte){
        return this.sopoService.modifySoporte(soporte);
    }
    
    @PostMapping(value="/{id}")
    public Boolean deleteSoporte (@PathVariable (value="id") Long id){
        return this.sopoService.deleteSoporte(id);
    }
            
}
