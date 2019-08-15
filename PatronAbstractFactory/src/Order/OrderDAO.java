/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Jeison
 */
public interface OrderDAO {
    public int insertOrder(int id);

	public boolean deleteOrder(int id);

	public Order findOrder(int id);

	public boolean updateOrder(int id, String name);

	public RowSet selectOrderRs(ArrayList<Integer> id);
}
