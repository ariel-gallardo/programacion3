/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio2;

import java.util.Date;

/**
 *
 * @author ariel
 */
public class Asistencia {
    private long id;
    private String tipo;
    private Date fecha;
    private int hora, minuto;
    private Empleado empleado;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Asistencia(long id, String tipo, Date fecha, int hora, int minuto, Empleado empleado) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.minuto = minuto;
        this.empleado = empleado;
    }
}
