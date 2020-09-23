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
public class Barrio {
    private long id;
    private String nombre, empresaConstructora;
    private ArrayList<Vivienda> viviendas;
    
    public Barrio(long id, String nombre, String empresaConstructora) {
        this.id = id;
        this.nombre = nombre;
        this.empresaConstructora = empresaConstructora;
    }

    public ArrayList<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }
    
    public double getSuperficieTotalTerreno(){
        double sT = 0.0;
        for (Vivienda vivienda : getViviendas()) {
            sT += vivienda.getSuperficieTerreno();
        }
        return sT;
    }
    
    public double getSuperficieTotalCubierta(){
        double m2Cubierto = 0.0;
        for (Vivienda vivienda : getViviendas()) {
            m2Cubierto += vivienda.getMetrosCuadradosCubiertos();
        }
        return m2Cubierto;
    }
}
