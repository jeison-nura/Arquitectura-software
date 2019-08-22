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
public class PatronComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BOOK _book = new BOOK();
        CD _cd = new CD();
        Box _firstBox = new Box();
        _firstBox.agregarProductos(_cd);
        _firstBox.agregarProductos(_book);
        Box _secondBox = new Box();
        _secondBox.agregarProductos(_firstBox);
        _secondBox.agregarProductos(_cd);
        _secondBox.agregarProductos(_book);
        Box _cajaMaestra = new Box();
        _cajaMaestra.agregarProductos(_secondBox);
        double pesoTotal = _cajaMaestra.getWeight();
        System.out.println("El total de peso de los productos es: " + pesoTotal);
    }
    
}
