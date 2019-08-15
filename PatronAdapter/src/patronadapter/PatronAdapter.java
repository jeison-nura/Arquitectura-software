/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

/**
 *
 * @author Jeison
 */
public class PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Troncomovil _tronco = new Troncomovil();
        carroza _carroza = new carroza();
        
        _carroza.Acelerar();
        _tronco.Acelerar();
    }
    
}
