/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon;

import Customer.customer;
import Customer.customerDAO;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class AmazonCustomerDAO implements customerDAO{

    @Override
    public int insertCustomer(int id) {
        System.out.println("Agregando customerAmazon");
        return 0;
    }

    @Override
    public boolean deleteCustomer(int id) {
        System.out.println("eliminando customer Amazon");
        return false;
    }

    @Override
    public customer findCustomer(int id) {
        System.out.println("encontrando customer Amazon");
        return null;
    }

    @Override
    public boolean updateCustomer(int id, String name) {
        System.out.println("Actualizando customer Amazon");
        return false;
    }

    @Override
    public RowSet selectCustomerRs(customer _customer) {
        System.out.println("seleccionando customer Amazon");
        return null;
    }
    
}
