/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import CloudScape.*;
import Order.Order;
import Order.OrderDAO;
import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class OracleOrderDAO implements OrderDAO{

    @Override
    public int insertOrder(int id) {
        System.out.println("agregar order Oracle");
        return 0;
    }

    @Override
    public boolean deleteOrder(int id) {
        System.out.println("eliminar order Oracle");
        return false;
    }

    @Override
    public Order findOrder(int id) {
        System.out.println("buscar order Oracle");
        return null;
    }

    @Override
    public boolean updateOrder(int id, String name) {
        System.out.println("actualizar order Oracle");
        return false;
    }

    @Override
    public RowSet selectOrderRs(ArrayList<Integer> id) {
        System.out.println("seleccionar order Oracle");
        return null;
    }
    
}
