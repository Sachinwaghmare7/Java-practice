package com.objectpool;

import java.util.ArrayList;
import java.util.List;




public class ConnectionPool {
	private List<Connection> pool = new ArrayList<>();
	private int MAX_POOL_SIZE = 3;
	public ConnectionPool() {
			for(int i = 0;i<MAX_POOL_SIZE;i++) {
				pool.add(new Connection());
			}
	}
	public synchronized Connection getConnection() {
		for(Connection conn : pool	) {
			if(!conn.isInUse()) {
				conn.setInUse(true);
				return conn;
			}
		}
		System.out.println("no avilable connections!");
		return null;
	}
		public synchronized void releaseConnection(Connection conn) {
			conn.setInUse(false);
			System.out.println("Connection released		");
		}
}
