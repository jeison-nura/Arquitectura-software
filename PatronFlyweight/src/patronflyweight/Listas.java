/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronflyweight;

import java.util.HashMap;

/**
 *
 * @author Jeison
 */
public class Listas implements Iflyweight{
    
    String clave = "";
    String valor = "";
    
    public Listas(String tipo, String nombre){
        this.clave = tipo;
        this.valor = nombre;
    }
    
    @Override
    public void mostrar() {
        System.out.println(clave + " " + valor);
    }

    @Override
    public String ObtenerNombre() {
        return valor;
    }

    @Override
    public String obtenerValor() {
        return clave;
    }
    
}
