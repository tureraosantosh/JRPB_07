package basic.dao;

import java.sql.SQLException;

public class TestDb {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbConnection dbConnect=new DbConnection();
		dbConnect.databaseConnect();
		
	}

}
