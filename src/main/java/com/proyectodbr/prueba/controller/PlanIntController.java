package com.proyectodbr.prueba.controller;

import com.proyectodbr.prueba.model.PlanInt;
import com.proyectodbr.prueba.service.PlanIntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planesdeinternet") 
public class PlanIntController {
   
   @Autowired
   private PlanIntService planIntService;
   
   @PostMapping("/nuevo")
   public PlanInt newPlanInt (@RequestBody PlanInt newPlanInt){
       return this.planIntService.newPlanInt(newPlanInt);
   }
   
   @GetMapping("/mostrar")
   public Iterable<PlanInt> getAll(){
   return planIntService.getAll();
   
   }
   
   @PostMapping("/modificar")
   public PlanInt uptadeplaInt(@RequestBody PlanInt planInt){
       return this.planIntService.modifyPlanInt(planInt);
       
   }
   
   @PostMapping(value="/{id}")
   public Boolean deletePlanInt(@PathVariable (value="id") Long id){
       return this.planIntService.deletePlanInt(id);
   }
}
