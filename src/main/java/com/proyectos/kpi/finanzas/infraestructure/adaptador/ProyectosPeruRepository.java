package com.proyectos.kpi.finanzas.infraestructure.adaptador;

import com.proyectos.kpi.finanzas.infraestructure.entity.ProyectosPeruEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProyectosPeruRepository extends JpaRepository<ProyectosPeruEntity, Integer> {
}
