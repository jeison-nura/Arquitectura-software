/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mongo;

import CloudScape.*;
import Cliente.clienteDAO;
import Customer.customerDAO;
import Factoria.FactoryDao;
import Order.OrderDAO;

/**
 *
 * @author Jeison
 */
public class MongoFactoryDAO extends FactoryDao{

    @Override
    public customerDAO getCustomerDAO() {
        System.out.println("dar customer Mongo");
        return null;
    }

    @Override
    public clienteDAO getAccountDAO() {
        System.out.println("dar cliente Mongo");
        return null;
    }

    @Override
    public OrderDAO getOrderDAO() {
        System.out.println("dar order Mongo");
        return null;
    }
    
}
