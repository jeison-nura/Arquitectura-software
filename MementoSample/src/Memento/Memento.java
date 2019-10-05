/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Originator.Persona;

/**
 *
 * @author bryan
 */
public class Memento {
    
    private final Persona persona;

    public Memento(Persona persona) {
        this.persona = persona;
    }
    
    public Persona getSavedState(){
    	System.out.println(persona);
        return persona;
    }
    
}
