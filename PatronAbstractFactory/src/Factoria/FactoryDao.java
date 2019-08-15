/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factoria;

import Amazon.AmazonFactoryDAO;
import Cliente.clienteDAO;
import CloudScape.CloudScapeFactoryDAO;
import Customer.customerDAO;
import Mongo.MongoFactoryDAO;
import Oracle.OracleFactoryDAO;
import Order.OrderDAO;
import Sybase.SybaseFactoryDAO;

/**
 *
 * @author Jeison
 */
public abstract class FactoryDao {
    public static final int CLOUDSCAPE = 1;
	public static final int ORACLE = 2;
	public static final int SYBASE = 3;
	public static final int MongoDB = 4;
	public static final int AmazonWebServices = 5;

	public abstract customerDAO getCustomerDAO();

	public abstract clienteDAO getAccountDAO();

	public abstract OrderDAO getOrderDAO();

	public static FactoryDao getFactoryDAO(int whichFactory) {

		switch (whichFactory) {
		case CLOUDSCAPE:
			return new CloudScapeFactoryDAO();
		case ORACLE:
			return new OracleFactoryDAO();
		case SYBASE:
			return new SybaseFactoryDAO();
		case MongoDB:
			return new MongoFactoryDAO();
		case AmazonWebServices:
			return new AmazonFactoryDAO();
		default:
			return null;
		}
	}
}
