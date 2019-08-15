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
abstract class textBuilder {
    protected Texto text;
    
    public Texto getTexto(){
        return text;
    }
    
    public abstract void ConstruirEncabezado();
    public abstract void ConstruirCuerpo();
    public abstract void ConstruirConcluciones();
    
}
