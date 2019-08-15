/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

/**
 *
 * @author Jeison
 */
public class Texto {
    public String encabezado = "";
    public String cuerpo="";
    public String concluciones = "";

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setConcluciones(String concluciones) {
        this.concluciones = concluciones;
    }
    
    
    @Override
    public String toString(){
        return encabezado + "\n" + cuerpo + "\n" + concluciones;
    }
    
}
