/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico.orm.Modelo;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author ariel
 */

@Entity
@PrimaryKeyJoinColumn(name = "idEmpleado")
public class Empleado extends Persona {
    private int nroLegajo;
    private double sueldo;

    public Empleado() {
        super();
    }
    
    public Empleado(int nroLegajo, double sueldo, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }
    
    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
