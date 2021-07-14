package basic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection createConnection() {
		Connection con = null;
		try {
			// load driver
			Class.forName("org.postgresql.Driver");
			// connection object
			// db information
			String uri = "jdbc:postgresql://localhost:5432/papp";
			String user = "postgres";
			String password = "root";
			con = DriverManager.getConnection(uri, user, password);
			System.out.println("Connection success!!");

			return con;
		} catch (Exception e) {
			System.out.println("Connection Failed !!" + e.getMessage());
			System.out.println(e);
			return con;
		}
	}

}
