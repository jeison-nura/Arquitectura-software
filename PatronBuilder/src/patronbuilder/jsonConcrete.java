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
public class jsonConcrete extends textBuilder{
    public jsonConcrete(){
        super.text = new Texto();  
    }

    @Override
    public void ConstruirEncabezado() {
        text.setEncabezado("Este es el encabezado de un json");
    }

    @Override
    public void ConstruirCuerpo() {
        text.setCuerpo("Este es el cuerpo de un json");
    }

    @Override
    public void ConstruirConcluciones() {
        text.setConcluciones("Estas son las concluciones de un json");
    }
    
}
