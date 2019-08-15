/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.Serializable;

/**
 *
 * @author Jeison
 */
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
	int AccountNUmber;
	String name;
	String detail;
	String city;

    public Cliente(int id) {
        this.AccountNUmber = id;
        this.name = "";
        this.detail = "";
        this.city = "";
    }
    
    	public Cliente() {
		AccountNUmber = (int) serialVersionUID;
		name = "";
		detail = "";
		city = "";		
	}
        

	public int getAccountNumber() {
		return AccountNUmber;
	}

	public void setAccountNumber(int accountNUmber) {
		AccountNUmber = accountNUmber;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
        
}
