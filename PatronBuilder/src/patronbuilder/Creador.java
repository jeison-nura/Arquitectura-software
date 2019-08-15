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
public class Creador {
    private textBuilder _textBuilder;
    
    public void setTextBuilder(textBuilder tb){
        _textBuilder = tb;
    }
    public Texto getTexto(){
        return _textBuilder.getTexto();
    }
    
    public void construirTexto(){
        _textBuilder.ConstruirEncabezado();
        _textBuilder.ConstruirCuerpo();
        _textBuilder.ConstruirConcluciones();
    }
}
