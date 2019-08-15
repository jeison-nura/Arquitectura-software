/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronabstractfactory;

import Cliente.Cliente;
import Cliente.clienteDAO;
import Customer.customer;
import Customer.customerDAO;
import Factoria.FactoryDao;
import java.util.Collection;

/**
 *
 * @author Jeison
 */
public class PatronAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryDao AmazonFactoryDao = FactoryDao.getFactoryDAO(FactoryDao.AmazonWebServices);

		
		clienteDAO _clienteDao = AmazonFactoryDao.getAccountDAO();

		int _clientenuevo = _clienteDao.insertAccount(506161022);

		Cliente _cliente = _clienteDao.findAccount(_clientenuevo);

               
                    //modificando cliente
                    _cliente.setDetail(" vivo en Kennedy");
                    _cliente.setCity("bogota");
                    //actualizando cliente
                    _clienteDao.updateAccount(_clientenuevo, "yisus");
                    //eliminando cliente
                    _clienteDao.deleteAccount(_clientenuevo);
                    //buscando cliente con la misma ciudad
                    Cliente _Cliente = new Cliente();
                    _Cliente.setCity("Alemania");
                    Collection customersList = (Collection) _clienteDao.selectAccountRs(_Cliente);
                
    }
    
}
