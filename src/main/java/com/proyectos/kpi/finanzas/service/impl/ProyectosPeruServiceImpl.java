package com.proyectos.kpi.finanzas.service.impl;


import com.proyectos.kpi.finanzas.domain.model.KpiFinancieros;
import com.proyectos.kpi.finanzas.domain.model.ProyectoFueraPresupuesto;
import com.proyectos.kpi.finanzas.domain.model.ProyectoInversion;
import com.proyectos.kpi.finanzas.infraestructure.adaptador.ProyectosPeruRepository;
import com.proyectos.kpi.finanzas.infraestructure.entity.ProyectosPeruEntity;
import com.proyectos.kpi.finanzas.service.ProyectosPeruService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProyectosPeruServiceImpl implements ProyectosPeruService {

    private final ProyectosPeruRepository proyectosPeruRepository;

    @Override
    public List<ProyectosPeruEntity> getProyectosPeru() {
        return proyectosPeruRepository.findAll();
    }

    @Override
    public KpiFinancieros getkpiFInancieros() {
        KpiFinancieros kpiFinancieros = new KpiFinancieros();
        List<ProyectosPeruEntity> proyectosPeruEntities = proyectosPeruRepository.findAll();


        double inversionTotal = proyectosPeruEntities.stream()
                .filter(Objects::nonNull)
                .filter(proyecto -> proyecto.getThreeYearAmount() != null)
                .mapToDouble(ProyectosPeruEntity::getThreeYearAmount)
                .sum();

        double promedioInversion = proyectosPeruEntities.stream()
                .filter(Objects::nonNull)
                .filter(proyecto -> proyecto.getThreeYearAmount() != null)
                .mapToDouble(proyecto -> proyecto.getThreeYearAmount() == null ? 0.0 : proyecto.getThreeYearAmount())
                .average()
                .orElse(0.0);

        List<ProyectoInversion> top5Proyectos = proyectosPeruEntities.stream()
                .filter(Objects::nonNull)
                .filter(proyecto -> proyecto.getActualizado() != null)
                .distinct()
                .sorted(Comparator.comparingDouble(proyecto -> -proyecto.getActualizado()))
                .limit(5)
                .map(proyecto -> ProyectoInversion.builder()
                        .nombre(proyecto.getNombre())
                        .inversion(proyecto.getActualizado())
                        .build())
                .collect(Collectors.toList());

        List<ProyectoFueraPresupuesto> fueraPresupuesto = proyectosPeruEntities.stream()
                .filter(Objects::nonNull)
                .filter(proyecto -> proyecto.getViable() != null && proyecto.getActualizado() != null)
                .filter(proyecto -> proyecto.getViable() > proyecto.getActualizado())
                .limit(10)
                .map(proyecto -> ProyectoFueraPresupuesto.builder()
                        .nombre(proyecto.getNombre())
                        .inversionAcumulada(proyecto.getViable())
                        .presupuestoAsignado(proyecto.getActualizado())
                        .build())
                .collect(Collectors.toList());

        kpiFinancieros.setInversionTotalAcumulada(inversionTotal);
        kpiFinancieros.setPromedioInversionPorProyecto(promedioInversion);
        kpiFinancieros.setTop5ProyectosPorInversion(top5Proyectos);
        kpiFinancieros.setProyectosFueraDelPresupuesto(fueraPresupuesto);
        return kpiFinancieros;
    }
}
