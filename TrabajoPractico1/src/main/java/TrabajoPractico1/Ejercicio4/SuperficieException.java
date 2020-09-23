/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1.Ejercicio4;

/**
 *
 * @author ariel
 */
public class SuperficieException extends NumberFormatException{
    
    public SuperficieException(){
        super("La superficie cubierta no puede ser mayor a la superficie del terreno");
    }
    
}
