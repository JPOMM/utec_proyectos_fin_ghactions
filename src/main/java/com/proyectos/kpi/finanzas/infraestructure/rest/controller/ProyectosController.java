package com.proyectos.kpi.finanzas.infraestructure.rest.controller;

import com.proyectos.kpi.finanzas.domain.model.KpiFinancieros;
import com.proyectos.kpi.finanzas.domain.model.ProyectosPeru;
import com.proyectos.kpi.finanzas.infraestructure.entity.ProyectosPeruEntity;
import com.proyectos.kpi.finanzas.service.ProyectosPeruService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/kpi")
public class ProyectosController {

    private final ProyectosPeruService proyectosPeruService;

    @GetMapping("/proyectos")
    public List<ProyectosPeruEntity> getProyectos (){
        //log.info("Product {}",this.productService.getProductById(id));
        return this.proyectosPeruService.getProyectosPeru();
    }

    @GetMapping("/financieros")
    public KpiFinancieros getKpiKpiFinancieros (){
        //log.info("Product {}",this.productService.getProductById(id));
        return this.proyectosPeruService.getkpiFInancieros();
    }

}
