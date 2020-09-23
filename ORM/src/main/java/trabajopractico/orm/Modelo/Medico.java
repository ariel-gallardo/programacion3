/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico.orm.Modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author ariel
 */
@Entity
@PrimaryKeyJoinColumn(name = "idMedico")
public class Medico extends Persona {
    private int matricula;
    private long celular;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "MedicoEspecialidad",
            joinColumns = @JoinColumn(name = "medico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id")
    )
    private List<Especialidad> especialidades;
    
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Turno> turnos;

    public Medico() {
        super();
    }

    public Medico(int matricula, long celular, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.matricula = matricula;
        this.celular = celular;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
}
