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
public class RadioBasico extends AutomovilDecorator{

    public RadioBasico(VentaAuto ventaAuto) {
        super(ventaAuto);
    }

    @Override
    public String getDescription() {
        return getVentaAuto().getDescription() + " Rdio basico ";
    }

    @Override
    public int getPrice() {
        return getVentaAuto().getPrice() + 15000;
    }
    
}
