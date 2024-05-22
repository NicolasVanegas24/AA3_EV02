package com.proyectodbr.prueba.service;

import com.proyectodbr.prueba.model.Soporte;


public interface SoporteService {
    
    Soporte newSoporte (Soporte newSoporte);
    
    Iterable<Soporte> getAll();
    
    Soporte modifySoporte (Soporte Soporte);
    
    Boolean deleteSoporte (Long idsoporte);
}
