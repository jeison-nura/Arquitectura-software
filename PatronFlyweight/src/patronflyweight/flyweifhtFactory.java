/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronflyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeison
 */
public class flyweifhtFactory {
    public List<Iflyweight> lista = new ArrayList<>();
    boolean existe = false;
    public void agregar(String clave, String nombre){
        for(Iflyweight f:lista){
            if( f.ObtenerNombre().equalsIgnoreCase(nombre)){
                existe = true;
            }
        }
        if(existe){
            System.out.println("este valor ya se encuentra");
        }else{
            Iflyweight Listas = new Listas(clave, nombre);
            lista.add(Listas);
        }
    }
    
    public void mostrar(String tipo){
        for(Iflyweight f:lista){
            if( f.obtenerValor().equals(tipo)){
                f.mostrar();
            }
        }
    }
}
