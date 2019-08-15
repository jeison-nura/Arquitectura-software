/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon;

import Cliente.Cliente;
import Cliente.clienteDAO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class AmazonClienteDao implements clienteDAO{

    Cliente _client;
    ArrayList<Cliente> _cli;

	public AmazonClienteDao() {
            System.out.println("Lista de clientes");
		_cli = new ArrayList<Cliente>();
	}

	
	@Override
	public int insertAccount(int id) {
            System.out.println("Creando cliente");
            _cli.add(new Cliente(id));
		return id;
	}

	@Override
	public boolean deleteAccount(int id) {
            System.out.println("Eliminando cliente");
		for (int i = 0; i < _cli.size(); i++) {
			if (_cli.get(i).getAccountNumber()== id) {
				System.out.println(id + " " + _cli.size());
				_cli.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Cliente findAccount(int id) {
            System.out.println("Encontrando cliente");
        for (Cliente _cliente : _cli) {
            if (_cliente.getAccountNumber()== id) {
                return _cliente;
            }
        }
		return null;
	}

	@Override
	public boolean updateAccount(int id, String name) {
            System.out.println("Actualizando cliente");
		for (int i = 0; i < _cli.size(); i++) {
			if (_cli.get(i).getAccountNumber()== id) {
				_cli.get(i).setName(name);
				return true;
			}
		}
		return false;

	}

	@Override
	public RowSet selectAccountRs(Cliente _cliente) {
            System.out.println("Seleccionando clientes");
		return null;
	}
}
