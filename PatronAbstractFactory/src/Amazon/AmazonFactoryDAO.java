/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon;

import Cliente.clienteDAO;
import Customer.customerDAO;
import Factoria.FactoryDao;
import Order.OrderDAO;

/**
 *
 * @author Jeison
 */
public class AmazonFactoryDAO extends FactoryDao{

    @Override
    public customerDAO getCustomerDAO() {
        System.out.println("dar customer Amazon");
        return new AmazonCustomerDAO();
    }

    @Override
    public clienteDAO getAccountDAO() {
        System.out.println("dar cliente Amazon");
        return new AmazonClienteDao();
    }

    @Override
    public OrderDAO getOrderDAO() {
        System.out.println("dar order Amazon");
        return new AmazonOrderDAO();
    }
    
}
