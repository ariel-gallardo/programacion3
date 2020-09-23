/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico.orm.Modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author ariel
 */
@Entity
@PrimaryKeyJoinColumn(name = "idPaciente", referencedColumnName = "idPersona")
public class Paciente extends Persona {

    private int nroSocio;
    
    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private HistoriaClinica historiaClinica;
    
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Turno> turnos;

    public Paciente() {
        super();
    }

    public Paciente(int nroSocio, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.nroSocio = nroSocio;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

}
