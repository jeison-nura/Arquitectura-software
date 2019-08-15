/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public interface customerDAO {
    public int insertCustomer(int id);

	public boolean deleteCustomer(int id);

	public customer findCustomer(int id);

	public boolean updateCustomer(int id, String name);

	public RowSet selectCustomerRs(customer criteria);
}
