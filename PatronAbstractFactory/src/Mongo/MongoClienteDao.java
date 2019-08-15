/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mongo;

import CloudScape.*;
import Cliente.Cliente;
import Cliente.clienteDAO;
import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public class MongoClienteDao implements clienteDAO{

    @Override
    public int insertAccount(int id) {
        System.out.println("Insertando Uusuario Mongo");
        return 0;
    }

    @Override
    public boolean deleteAccount(int id) {
        System.out.println("Eliminando usuario Mongo");
        return false;
    }

    @Override
    public Cliente findAccount(int id){ 
        System.out.println("Encontrando cliente Mongo");
        return null;
    }

    @Override
    public boolean updateAccount(int id, String name) {
        System.out.println("Actualizando cliente Mongo");
        return false;
    }

    @Override
    public RowSet selectAccountRs(Cliente _cliente) {
        System.out.println("Seleccionando cuenta Mongo");
        return null;
    }
    
}
