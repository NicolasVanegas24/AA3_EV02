package com.proyectodbr.prueba.service;


import com.proyectodbr.prueba.model.PlanInt;
import com.proyectodbr.prueba.repository.PlanIntRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanIntServiceImpl implements PlanIntService{

    @Autowired
    private PlanIntRepository planIntRepository;
    
    @Override
    public PlanInt newPlanInt(PlanInt newPlanInt) {
        return planIntRepository.save(newPlanInt);
    }

    @Override
    public Iterable<PlanInt> getAll() {

        return this.planIntRepository.findAll();
    }

    @Override
    public PlanInt modifyPlanInt(PlanInt planInt) {
        Optional<PlanInt> planIntEncontrado= this.planIntRepository.findById(planInt.getIdplanint());
        
        if(planIntEncontrado.get()!=null){
            planIntEncontrado.get().setNombreplan(planInt.getNombreplan());
            planIntEncontrado.get().setVelocidad(planInt.getVelocidad());
            planIntEncontrado.get().setPrecio(planInt.getPrecio());
            planIntEncontrado.get().setDescripcion(planInt.getDescripcion());
            return this.newPlanInt(planIntEncontrado.get());
        }
        
    return null;
    }

    @Override
    public Boolean deletePlanInt(Long idplanint) {
        this.planIntRepository.deleteById(idplanint);
        return true;
    }
    
}
