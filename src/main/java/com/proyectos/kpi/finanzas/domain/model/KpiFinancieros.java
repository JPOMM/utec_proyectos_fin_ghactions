package com.proyectos.kpi.finanzas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KpiFinancieros {
    // Atributo: Suma total de la inversión en los proyectos
    private double inversionTotalAcumulada;
    // Atributo: Promedio de inversión por proyecto
    private double promedioInversionPorProyecto;
    private List<ProyectoInversion> top5ProyectosPorInversion;
    private List<ProyectoFueraPresupuesto> proyectosFueraDelPresupuesto;
}
