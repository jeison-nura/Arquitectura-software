/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecorator;

/**
 *
 * @author Jeison
 */
public class BWM extends  Automovil{

    @Override
    public String getDescription() {
        return "BWM";
    }

    @Override
    public int getPrice() {
        return 5000000;
    }
    
}
