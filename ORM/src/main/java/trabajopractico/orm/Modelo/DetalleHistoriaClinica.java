/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico.orm.Modelo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ariel
 */
@Entity
public class DetalleHistoriaClinica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleHC;
    private Date fechaAtencion;
    private String sintomas, diagnostico, observaciones;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "historiaClinica_id")
    private HistoriaClinica historiaClinica;

    public DetalleHistoriaClinica() {
    }

    public DetalleHistoriaClinica(Date fechaAtencion, String sintomas, String diagnostico, String observaciones) {
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
    }

    public int getIdDetalleHC() {
        return idDetalleHC;
    }

    public void setIdDetalleHC(int idDetalleHC) {
        this.idDetalleHC = idDetalleHC;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
}
