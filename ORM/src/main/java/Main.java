
import java.sql.Date;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import trabajopractico.orm.Modelo.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ariel
 */
public class Main {

    private static String persistenceUnitName = "trabajopractico_ORM_jar_1.0-SNAPSHOTPU";
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static EntityTransaction entityTransaction;
    private static Main persistencia;
    private static Empleado empleado;
    private static Medico medico;
    private static Paciente paciente;

    public static void main(String[] args) {
        empleado = new Empleado(0, 2000.0, "Jose", "Alvarez", 32726183L);
        medico = new Medico(1, 2615489750L, "Alejandro", "Cabrera", 12657840L);
        paciente = new Paciente(2, "Ariel", "Gutierrez", 23456789L);

        empleado.setDomicilio(new Domicilio("Godoy Cruz", "San Martin Sur", 614));
        medico.setDomicilio(new Domicilio("Las Heras", "Callejon Morales", 235));
        paciente.setDomicilio(new Domicilio("Guaymallén", "Pedro Molina", 235));

        medico.setEspecialidades(
                Arrays.asList(
                        new Especialidad("Odontologo"),
                        new Especialidad("Cirujano Plástico"),
                        new Especialidad("Otorringonaringologo")
                ));

        medico.setTurnos(
                Arrays.asList(
                        new Turno(0, 0, new Date(2020, 10, 10)),
                        new Turno(13, 30, new Date(2020, 12, 5))
                ));

        paciente.setTurnos(medico.getTurnos());

        paciente.setHistoriaClinica(new HistoriaClinica(0, new Date(2020, 5, 1)));
        paciente.getHistoriaClinica().setDetallesHistoriaClinica(
                Arrays.asList(
                        new DetalleHistoriaClinica(new Date(2020, 5, 1), "Tos", "Covicho", "Cansancio"),
                        new DetalleHistoriaClinica(new Date(2020, 5, 1), "Sed", "Fiebre", "Cansancio")
                ));
        
        Persistir(empleado);
        Persistir(paciente);
        Persistir(medico);
    }

    public static void Persistir(Object o) {
       
            entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(o);                                           //Crea una instancia del objeto y la persiste.
            entityManager.flush();                                              //Sincroniza la persistencia con la db.
            entityTransaction.commit();                                         //Confirma los cambios de persistencia en la db.
            entityManager.close();                                              //Cierra las conexiones
            entityManagerFactory.close();


    }

}
