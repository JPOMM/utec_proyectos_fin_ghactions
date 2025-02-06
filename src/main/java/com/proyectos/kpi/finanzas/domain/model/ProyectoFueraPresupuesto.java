package com.proyectos.kpi.finanzas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase interna para proyectos que han excedido el presupuesto
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProyectoFueraPresupuesto {
    private String nombre;
    private double inversionAcumulada;
    private double presupuestoAsignado;
}
