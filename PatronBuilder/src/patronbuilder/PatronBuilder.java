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
public class PatronBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creador _creado = new Creador();
        textBuilder jsonConcrete = new jsonConcrete();
        textBuilder xmlConcrete = new xmlConcrete();
        
        _creado.setTextBuilder(jsonConcrete);
        _creado.construirTexto();
        
        Texto text = _creado.getTexto();
        System.out.println(text.toString());
        
    }
    
}
