package com.proyectos.kpi.finanzas.service;

import com.proyectos.kpi.finanzas.domain.model.KpiFinancieros;
import com.proyectos.kpi.finanzas.domain.model.ProyectosPeru;
import com.proyectos.kpi.finanzas.infraestructure.entity.ProyectosPeruEntity;

import java.util.List;

public interface ProyectosPeruService {

    public List<ProyectosPeruEntity> getProyectosPeru();

    public KpiFinancieros getkpiFInancieros();
}
