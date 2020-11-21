package org.ifpb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
		// Initialize all the information regarding
	    // Database Connection
		String dbDriver = "com.mysql.jdbc.Driver";
//	    String dbURL = "jdbc:mysql://b0e6416f0e8760:2123432c@us-cdbr-east-02.cleardb.com/heroku_4d1a6a5d8ab68d5?reconnect=true";
		String dbURL = "jdbc:mysql://localhost:3306/projetoweb";
	    
	    // Database name to access
//	    String dbName = "heroku_4d1a6a5d8ab68d5";
//	    String dbUsername = "b0e6416f0e8760";
//	    String dbPassword = "2123432c";
	    
//	    String dbName = "projetoweb";
	    String dbUsername = "root";
	    String dbPassword = "zeus1998";
	  
	    
	    Class.forName(dbDriver);
	    Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);

	    return con;
	} 
}
