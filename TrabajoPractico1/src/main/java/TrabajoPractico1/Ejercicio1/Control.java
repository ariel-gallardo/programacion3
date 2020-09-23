/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio1;

/**
 *
 * @author ariel
 */
public class Control {
    private int id;
    private String denominacion;
    private boolean obligatorio;
    private EstadoControl estadoControl;

    public Control(int id, String denominacion, boolean obligatorio) {
        this.id = id;
        this.denominacion = denominacion;
        this.obligatorio = obligatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(boolean obligatorio) {
        this.obligatorio = obligatorio;
    }

    public EstadoControl getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(EstadoControl estadoControl) {
        this.estadoControl = estadoControl;
    }
    
    
    @Override
    public String toString(){
        return getDenominacion();
    }
}
