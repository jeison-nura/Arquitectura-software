/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Originator;

import Memento.Memento;

/**
 *
 * @author bryan
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String carrera;
    private String direccion;
    private String telefono;

    public Persona(String nombre2, String apellidos2, int edad2, String carrera2, String direccion2, String telefono2) {
    	this.nombre = nombre2;
        this.apellidos = apellidos2;
        this.edad = edad2;
        this.carrera = carrera2;
        this.direccion = direccion2;
        this.telefono = telefono2;
	}
    
    public Persona() {
    	
    }

	public Memento saveToMemento() {
        System.out.println("Originator: Guardando memento...");        
        return new Memento(new Persona (nombre,apellidos,edad,carrera,direccion,telefono));
    }
    
    public void restoreFromMemento(Memento m) {
        this.nombre = m.getSavedState().getNombre();
        this.apellidos = m.getSavedState().getApellidos();
        this.edad = m.getSavedState().getEdad();
        this.carrera = m.getSavedState().getCarrera();
        this.direccion = m.getSavedState().getDireccion();
        this.telefono = m.getSavedState().getTelefono();
    }

    public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
    	return nombre + " " + apellidos + " " + edad + " " + direccion +
    			" " + carrera + " " + telefono;
    }
}
