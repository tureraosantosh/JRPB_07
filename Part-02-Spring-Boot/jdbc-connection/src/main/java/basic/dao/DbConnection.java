package basic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public void databaseConnect() throws ClassNotFoundException, SQLException {
		// Loading Driver
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/phoneapp";
		String userName = "postgres";
		String password = "root";		
		//Object
		Connection con;		
		con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("Connection Successfull !");

	}

}
