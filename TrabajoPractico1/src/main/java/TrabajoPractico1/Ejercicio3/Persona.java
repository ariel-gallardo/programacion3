/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Persona {
    private String nombre, tipoDocumento, email, celular;
    private long nroDocumento;
    private int telefono;
    private ArrayList<Actividad> actividades;

    public Persona(String nombre, String tipoDocumento, String email, String celular, long nroDocumento, int telefono) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.email = email;
        this.celular = celular;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        actividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    public double totalPuntosAsignados(){
        double puntaje = 0.0;
        for (Actividad actividad : getActividades()) {
            puntaje += actividad.getTipoActividad().getPuntosAsignados();
        }
        return puntaje;
    }
    
    public double totalPuntosAsignados (int codigo){
        double puntaje = 0.0;
        for (Actividad actividad : actividades) {
            if(actividad.getTipoActividad().getCodigo() == codigo){
                puntaje += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return puntaje;
    }
    
    public double totalPuntosAsignados (int codigo, int anio){
        double puntaje = 0.0;
        for (Actividad actividad : actividades) {
            if(actividad.getTipoActividad().getCodigo() == codigo && actividad.getFechaInicio().getYear() >= anio && actividad.getFechaFin().getYear() <= anio){
                puntaje += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return puntaje;
    }
}
