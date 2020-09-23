/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Vivienda {
    private long id;
    private String calle;
    private int numeroCalle;
    private Double superficieTerreno;
    private ArrayList<Habitacion> habitaciones;

    public Vivienda(long id, String calle, int numeroCalle) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public Double getSuperficieTerreno() {
        return superficieTerreno;
    }
    
    public void setSuperficieTerreno(Double superficieTerreno){
        this.superficieTerreno = superficieTerreno;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public double getMetrosCuadradosCubiertos(){
        Double m2 = 0.0;
        try{
            for (Habitacion habitacion : getHabitaciones()) {
                m2 += habitacion.getMetrosCuadrados();
                if(m2 > getSuperficieTerreno()){
                    throw new SuperficieException();
                }
            }
        }catch(SuperficieException sE){
            System.out.println(sE.getMessage());
        }
        return m2;
    }
}
