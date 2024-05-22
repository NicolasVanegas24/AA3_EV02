package com.proyectodbr.prueba.service;

import com.proyectodbr.prueba.model.Soporte;
import com.proyectodbr.prueba.repository.SoporteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoporteServiceImpl implements SoporteService{

    @Autowired
    private SoporteRepository soporteRepository;
    
    @Override
    public Soporte newSoporte(Soporte newSoporte) {
    return soporteRepository.save(newSoporte);
    }

    @Override
    public Iterable<Soporte> getAll() {
    return this.soporteRepository.findAll();
    }

    @Override
    public Soporte modifySoporte(Soporte Soporte) {
        Optional<Soporte> soporteEncontrado= this.soporteRepository.findById(Soporte.getIdsoporte());
        
        if(soporteEncontrado.get()!=null){
            soporteEncontrado.get().setFechasoli(Soporte.getFechasoli());
            soporteEncontrado.get().setFecharesolu(Soporte.getFecharesolu());
            soporteEncontrado.get().setEstado(Soporte.getEstado());
            soporteEncontrado.get().setDescprob(Soporte.getDescprob());
            soporteEncontrado.get().setSolucion(Soporte.getSolucion());
            return this.newSoporte(soporteEncontrado.get());
        }
        
    return null;
    }

    @Override
    public Boolean deleteSoporte(Long idsoporte) {
        this.soporteRepository.deleteById(idsoporte);
        return true;
    }
    
}
