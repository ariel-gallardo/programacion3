/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1;

import TrabajoPractico1.Ejercicio1.Expediente;

/**
 *
 * @author ariel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1
        Expediente Padre = new Expediente(0, 0, "A", "Ariel Gallardo", "Ambito1", "1"),
                    Usuario = new Expediente(1, 1, "B", "Usuario", "Ambito2", "2"),
                        u1 = new Expediente(2, 2, "B1", "Taringa", "Ambito3", "3"),
                    Carnet = new Expediente(3, 3, "C", "Carnet", "Ambito4", "4"),
                        c1 = new Expediente(4, 4, "C1", "Conducir", "Ambito5", "5");
        
        Usuario.addExHijo(u1);
        Carnet.addExHijo(c1);
        
        Padre.addExHijo(Usuario);
        Padre.addExHijo(Carnet);
        
        System.out.println(Padre);
        System.out.println(Padre.listaExpedientes(Padre));
    }
    
}
