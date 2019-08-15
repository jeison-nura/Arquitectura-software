/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mongo;

import CloudScape.*;
import Order.Order;
import Order.OrderDAO;
import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class MongoOrderDAO implements OrderDAO{

    @Override
    public int insertOrder(int id) {
        System.out.println("agregar order Mongo");
        return 0;
    }

    @Override
    public boolean deleteOrder(int id) {
        System.out.println("eliminar order Mongo");
        return false;
    }

    @Override
    public Order findOrder(int id) {
        System.out.println("buscar order Mongo");
        return null;
    }

    @Override
    public boolean updateOrder(int id, String name) {
        System.out.println("actualizar order Mongo");
        return false;
    }

    @Override
    public RowSet selectOrderRs(ArrayList<Integer> id) {
        System.out.println("seleccionar order Mongo");
        return null;
    }
    
}
