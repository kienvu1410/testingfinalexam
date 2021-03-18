package com.vti.untils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	private Connection connection;

	public JDBCUtils() throws IOException {

	}

	public void connectForTesting()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		// Step 1: register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success!");
	}

	
	public Connection connect()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testingsystemassignment1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		// Step 1: register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public void disconnect() throws SQLException {
		connection.close();
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}

