/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.io.Serializable;

/**
 *
 * @author Jeison
 */
public class Order implements Serializable{
    private static final long serialVersionUID = 1L;

	public int idOrder;
	public String titleOrder;
	public int idCustomer;

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public String getTitleOrder() {
		return titleOrder;
	}

	public void setTitleOrder(String titleOrder) {
		this.titleOrder = titleOrder;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

}
