package org.ifpb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
		// Initialize all the information regarding
	    // Database Connection
		String dbDriver = "com.mysql.jdbc.Driver";
	    String dbURL = "jdbc:mysql://cnd29p1s3hpo0d0r:quefst49yohhtfdt@aqx5w9yc5brambgl.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/c13gtp4sowytgmhx";
	    
	    // Database name to access
	    String dbName = "c13gtp4sowytgmhx";
	    String dbUsername = "cnd29p1s3hpo0d0r";
	    String dbPassword = "quefst49yohhtfdt";
	  
	    
	    Class.forName(dbDriver);
	    Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);

	    return con;
	} 
}
