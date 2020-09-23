/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Expediente {
    private int id, numero;
    private String letra, descripcion, tipo, ambito;
    private ArrayList<Control> controles;
    private Expediente exPadre;
    private ArrayList<Expediente> exHijos;
    private static ArrayList<Expediente> tempLista;
    

    public Expediente(int id, int numero, String letra, String descripcion, String tipo, String ambito) {
        this.id = id;
        this.numero = numero;
        this.letra = letra;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        controles = new ArrayList<>();
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ambito
     */
    public String getAmbito() {
        return ambito;
    }

    /**
     * @param ambito the ambito to set
     */
    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    
    public String getCaratulaExpediente(){
        return getNumero()+" - "+getLetra()+" - "+getDescripcion();
    }
    
    @Override
    public String toString(){
        return (getExPadre() != null ? "\n\t" + getCaratulaExpediente() : getCaratulaExpediente()) + "\n";
    }
    
    public String getControlesObligatorios(){
        String conO = "";
        for (Control control : controles) {
            if(control.isObligatorio())
                conO += control;
            if(control.getId() != controles.get(controles.size()-1).getId())
                conO += ", ";
        }
        return conO;
    }

    public Expediente getExPadre() {
        return exPadre;
    }

    public void setExPadre(Expediente exPadre) {
        this.exPadre = exPadre;
    }
    
    public boolean getEstadoControles(){
        for (Control control : controles) {
            if(control.isObligatorio()){
                if(!control.getEstadoControl().isAprobado()){
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }

    public ArrayList<Expediente> getExHijos() {
        return exHijos;
    }

    public void setExHijos(ArrayList<Expediente> exHijos) {
        this.exHijos = exHijos;
    }
    
    public ArrayList<Expediente> listaExpedientes(Expediente expediente){
        if(tempLista == null){
            tempLista = new ArrayList<>();
        }
        
        if(expediente.getExHijos() != null){
            tempLista.addAll(expediente.getExHijos());
                for (Expediente exHijo : expediente.getExHijos()) {
                    exHijo.setExPadre(this);
                    listaExpedientes(exHijo);
                }
        }
        
        return tempLista;
    }
    
    public void addExHijo(Expediente ex){
        if(exHijos == null){
            exHijos = new ArrayList<>();
        }
        exHijos.add(ex);
    }
    
    public void addHijos(ArrayList<Expediente> Hijos){
        if(exHijos == null){
            exHijos = new ArrayList<>();
        }
        exHijos.addAll(Hijos);
    }
}
