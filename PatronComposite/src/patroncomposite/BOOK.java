/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncomposite;

/**
 *
 * @author Jeison
 */
public class BOOK implements IBox{
    double peso = 20;
    @Override
    public double getWeight() {
        return peso;
    }
    
}
