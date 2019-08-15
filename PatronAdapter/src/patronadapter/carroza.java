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
public class carroza implements vehiculo{

    @Override
    public void Frenar() {
        halarRiendas();
    }

    @Override
    public void Acelerar() {
        moverRiendas();
        arrearCaballos();
    }

    private void halarRiendas() {
        System.out.println("halar riendas");
    }

    private void moverRiendas() {
        System.out.println("mover riendas");
    }

    private void arrearCaballos() {
        System.out.println("arrear caballos");
    }
    
}
