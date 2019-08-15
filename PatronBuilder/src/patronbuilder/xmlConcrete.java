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
public class xmlConcrete extends textBuilder{

    public xmlConcrete(){
        super.text = new Texto();  
    }

    @Override
    public void ConstruirEncabezado() {
        text.setEncabezado("Este es el encabezado de un xml");
    }

    @Override
    public void ConstruirCuerpo() {
        text.setCuerpo("Este es el cuerpo de un xml");
    }

    @Override
    public void ConstruirConcluciones() {
        text.setConcluciones("Estas son las concluciones de un xml");
    }
    
}
