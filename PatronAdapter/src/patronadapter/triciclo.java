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
public class triciclo implements vehiculo{

    @Override
    public void Frenar() {
        bajarPies();
        rozarPies();
    }

    @Override
    public void Acelerar() {
        pedalear();
    }

    private void bajarPies() {
        System.out.println("bajar pies");
    }

    private void rozarPies() {
        System.out.println("rozar pies");
    }

    private void pedalear() {
        System.out.println("pedalear");
    }
    
}
