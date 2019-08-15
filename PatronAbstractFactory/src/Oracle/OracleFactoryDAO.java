/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import CloudScape.*;
import Cliente.clienteDAO;
import Customer.customerDAO;
import Factoria.FactoryDao;
import Order.OrderDAO;

/**
 *
 * @author Jeison
 */
public class OracleFactoryDAO extends FactoryDao{

    @Override
    public customerDAO getCustomerDAO() {
        System.out.println("dar customer Oracle");
        return null;
    }

    @Override
    public clienteDAO getAccountDAO() {
        System.out.println("dar cliente Oracle");
        return null;
    }

    @Override
    public OrderDAO getOrderDAO() {
        System.out.println("dar order Oracle");
        return null;
    }
    
}
