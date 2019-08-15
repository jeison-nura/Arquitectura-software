/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mongo;

import CloudScape.*;
import Customer.customer;
import Customer.customerDAO;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class MongoCustomerDAO implements customerDAO{

    @Override
    public int insertCustomer(int id) {
        System.out.println("Agregando customer Mongo");
        return 0;
    }

    @Override
    public boolean deleteCustomer(int id) {
        System.out.println("eliminando customer Mongo");
        return false;
    }

    @Override
    public customer findCustomer(int id) {
        System.out.println("encontrando customer Mongo");
        return null;
    }

    @Override
    public boolean updateCustomer(int id, String name) {
        System.out.println("Actualizando customer Mongo");
        return false;
    }

    @Override
    public RowSet selectCustomerRs(customer criteria) {
        System.out.println("seleccionando customer Mongo");
        return null;
    }
    
}
