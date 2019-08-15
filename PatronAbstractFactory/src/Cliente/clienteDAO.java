/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public interface clienteDAO {
    public int insertAccount(int id);

	public boolean deleteAccount(int id);

	public Cliente findAccount(int id);

	public boolean updateAccount(int id, String name);

	public RowSet selectAccountRs(Cliente cliente);
}
