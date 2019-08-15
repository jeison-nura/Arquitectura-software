/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeison
 */
public class Configuracion{
    private static final Configuracion confi = new Configuracion();
    private List<String> aplicaciones = new ArrayList<String>();
    
    public void configuracionInicial(){
        if(aplicaciones.isEmpty()){
            System.out.println("No hay Aplicaciones agregadas");
        }else{
            for (String aplicacion : aplicaciones) {
                System.out.println(aplicacion + " usa esta configuracion");
            }
        }
    }
    
    public void añadirAplicacion(String nombreApp){
        aplicaciones.add(nombreApp);
    }
    
    private Configuracion(){}
    
    
    public static Configuracion getConfig(){
        return confi;
    }
}
