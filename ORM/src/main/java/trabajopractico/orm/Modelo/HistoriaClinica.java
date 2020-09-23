/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico.orm.Modelo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ariel
 */
@Entity
public class HistoriaClinica implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistoriaClinica;
    
    private int numero;
    private Date fechaAlta;
    
    @OneToMany(mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    private List<DetalleHistoriaClinica> detallesHistoriaClinica;
    
    @OneToOne
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente")
    private Paciente paciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(int numero, Date fechaAlta) {
        this.numero = numero;
        this.fechaAlta = fechaAlta;
    }

    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<DetalleHistoriaClinica> getDetallesHistoriaClinica() {
        return detallesHistoriaClinica;
    }

    public void setDetallesHistoriaClinica(List<DetalleHistoriaClinica> detallesHistoriaClinica) {
        this.detallesHistoriaClinica = detallesHistoriaClinica;
    }
    
}
