/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CloudScape;

import Cliente.Cliente;
import Cliente.clienteDAO;
import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class CloudScapeClienteDao implements clienteDAO{

    @Override
    public int insertAccount(int id) {
        System.out.println("Insertando Uusuario CloudScape");
        return 0;
    }

    @Override
    public boolean deleteAccount(int id) {
        System.out.println("Eliminando usuario CloudScape");
        return false;
    }

    @Override
    public Cliente findAccount(int id){ 
        System.out.println("Encontrando cliente CloudScape");
        return null;
    }

    @Override
    public boolean updateAccount(int id, String name) {
        System.out.println("Actualizando cliente CloudScape");
        return false;
    }

    @Override
    public RowSet selectAccountRs(Cliente _cliente) {
        System.out.println("Seleccionando cuenta CloudScape");
        return null;
    }
    
}
