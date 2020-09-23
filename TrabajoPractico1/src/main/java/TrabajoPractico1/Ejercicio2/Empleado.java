/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ariel
 */
public class Empleado {
    private String nombre, domicilio, email;
    private long cuit;
    private ArrayList<Tardanza> tardanzas;
    private ArrayList<Asistencia> asistencias;
    private RegimenHorario regimenHorario;

    public RegimenHorario getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(RegimenHorario regimenHorario) {
        this.regimenHorario = regimenHorario;
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public ArrayList<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(ArrayList<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }

    public Empleado(String nombre, String domicilio, String email, long cuit) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    
    public ArrayList<Asistencia> getAsistenciaXMesXAnio(int mes, int anio){
        ArrayList<Asistencia> tempAsistencias = new ArrayList<>();
        for (Asistencia asistencia : getAsistencias()) {
            if(asistencia.getFecha().getMonth() == mes && asistencia.getFecha().getYear() == anio)
                tempAsistencias.add(asistencia);
        }
        return tempAsistencias;
    } 
    
    public ArrayList<Tardanza> getDiasConTardanza(int mes, int anio){
        ArrayList<Tardanza> tempTardanzas = new ArrayList<>();
        for (Asistencia asistencia : getAsistenciaXMesXAnio(mes,anio)) {
            if((asistencia.getHora()*3600+asistencia.getMinuto()*60 - regimenHorario.getHoraIngreso() * 3600 + regimenHorario.getMinutoIngreso()) > 15*60){
                tempTardanzas.add(new Tardanza(getCuit(), null, asistencia.getFecha(), asistencia.getHora(), asistencia.getMinuto(), this));
            }
        }
        return tempTardanzas;
    } 
}
