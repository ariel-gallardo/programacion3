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
public class Sector {
    private int numero;
    private String denominacion, tipo;
    private Sector subSector;
    private static ArrayList<Sector> subSectores;

    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sector getSubSector() {
        return subSector;
    }

    public void setSubSector(Sector subSector) {
        this.subSector = subSector;
    }

    public static ArrayList<Sector> getSubSectores() {
        return subSectores;
    }

    public ArrayList<Sector> obtenerTotalSubsectores(){
        if(subSectores == null){subSectores = new ArrayList<>();}else if(subSector != null){
            subSectores.add(subSector);
            subSector.obtenerTotalSubsectores();
        }
        return subSectores.isEmpty() ? null : getSubSectores(); 
    }
    
}
