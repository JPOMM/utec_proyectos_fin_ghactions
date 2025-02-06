package com.proyectos.kpi.finanzas.infraestructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "proyectosperu" , schema = "dbo")
public class ProyectosPeruEntity {

    @Id
    private Long codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "prioridad")
    private String prioridad;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "financiera")
    private String financiera;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "ultimo")
    private String ultimo;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "idea")
    private Long idea;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "viable")
    private Long viable;

    @Column(name = "actualizado")
    private Long actualizado;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "etapa")
    private String etapa;

    @Column(name = "zonal")
    private String zonal;

    @Column(name = "region")
    private String region;

    @Column(name = "ejecutivo")
    private String ejecutivo;

    @Column(name = "updatedDate")
    private String updatedDate;

    @Column(name = "snipCode")
    private Long snipCode;

    @Column(name = "investmentRange")
    private String investmentRange;

    @Column(name = "precedence")
    private String precedence;

    @Column(name = "zeroYearAmount")
    private Long zeroYearAmount;

    @Column(name = "oneYearAmount")
    private Long oneYearAmount;

    @Column(name = "twoYearAmount")
    private Long twoYearAmount;

    @Column(name = "threeYearAmount")
    private Long threeYearAmount;

    @Column(name = "commissionedFunction")
    private String commissionedFunction;

    @Column(name = "commissionedProgram")
    private String commissionedProgram;

    @Column(name = "commissionedSubprogram")
    private String commissionedSubprogram;

    @Column(name = "situation")
    private String situation;

    @Column(name = "investmentStatus")
    private String investmentStatus;

    @Column(name = "ownerGovernmentLevel")
    private String ownerGovernmentLevel;

    @Column(name = "ownerSector")
    private String ownerSector;

    @Column(name = "OPMIUnit")
    private String OPMIUnit;

    @Column(name = "UEIUnit")
    private String UEIUnit;

    @Column(name = "OPMIResponsible")
    private String OPMIResponsible;

    @Column(name = "UEIResponsible")
    private String UEIResponsible;

    @Column(name = "UFResponsible")
    private String UFResponsible;

    @Column(name = "OPIEntity")
    private String OPIEntity;

    @Column(name = "OPIResponsible")
    private String OPIResponsible;

    @Column(name = "executingEntity")
    private String executingEntity;

    @Column(name = "registrationDate")
    private String registrationDate;

    @Column(name = "studyStatus")
    private String studyStatus;

    @Column(name = "feasibilityResponsible")
    private String feasibilityResponsible;

    @Column(name = "beneficiariesQuantity")
    private Long beneficiariesQuantity;

    @Column(name = "currentYearPIAAmount")
    private Long currentYearPIAAmount;

    @Column(name = "currentYearPIMAmount")
    private Long currentYearPIMAmount;

    @Column(name = "zeroYearPIMAmount")
    private Long zeroYearPIMAmount;

    @Column(name = "currentYearAccruedAmount")
    private Long currentYearAccruedAmount;

    @Column(name = "accumulatedAccruedAmount")
    private String accumulatedAccruedAmount;

    @Column(name = "framework")
    private String framework;

    @Column(name = "formatType")
    private String formatType;

    @Column(name = "lastYearAccumulatedAccruedAmount")
    private Long lastYearAccumulatedAccruedAmount;

    @Column(name = "balanceAmountToFinance")
    private Long balanceAmountToFinance;

    @Column(name = "firstAccrualDate")
    private Long firstAccrualDate;

    @Column(name = "lastAccrualDate")
    private Long lastAccrualDate;

    @Column(name = "PMIProgrammingIncluded")
    private String PMIProgrammingIncluded;

    @Column(name = "PMIExecutingIncluded")
    private String PMIExecutingIncluded;

    @Column(name = "FONIPRELWinner")
    private String FONIPRELWinner;

    @Column(name = "crossingSpeciality")
    private String crossingSpeciality;

    @Column(name = "solution")
    private String solution;

    @Column(name = "potentialTons")
    private Long potentialTons;
}
