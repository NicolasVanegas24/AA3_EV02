package com.proyectodbr.prueba.service;

import com.proyectodbr.prueba.model.PlanInt;


public interface PlanIntService {
    
    PlanInt newPlanInt (PlanInt newPlanInt);
    
    Iterable<PlanInt> getAll();
    
    PlanInt modifyPlanInt (PlanInt planInt);
    
    Boolean deletePlanInt (Long idplanint);
}
