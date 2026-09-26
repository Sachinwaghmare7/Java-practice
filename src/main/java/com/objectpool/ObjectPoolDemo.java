package com.objectpool;


public class ObjectPoolDemo {
	public static void main(String[] args) {
			ConnectionPool pool = new ConnectionPool();
			
			
			Connection c1 = pool.getConnection();	
			c1.connect();	
			Connection c2 = pool.getConnection();	
			c2.connect();
//			pool.releaseConnection(c1);
			
			Connection c3 = pool.getConnection();	
			c3.connect();
			
			c1.connect();
			c2.connect();
			c3.connect();
			c1.connect();
	}
}
