/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeison
 */
public class Box implements IBox{

    private List<IBox>Productos = new ArrayList<>();
    
    
    @Override
    public double getWeight() {
        double valores = 0;
        for(IBox child: Productos){
            valores += child.getWeight();
        }
        return valores;
    }
    
    void agregarProductos(IBox producto){
        Productos.add(producto);
    }
    
    void eliminarProductos(IBox producto){
        Productos.remove(producto);
    }
    
}
