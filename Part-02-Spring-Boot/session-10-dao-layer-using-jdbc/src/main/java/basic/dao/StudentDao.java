package basic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	public void saveStudent(Student student) {
		// Connection
		try {
			Connection con = DbConnection.createConnection();
			// SQL
			String sql = "insert into student(id,fname,lname,email)values(?,?,?,?)";
			// Statement
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, student.getId());
			stmt.setString(2, student.getFname());
			stmt.setString(3, student.getLname());
			stmt.setString(4, student.getEmail());
			// Execution
			stmt.executeUpdate();
			System.out.println("Data Inserted Success !!! ");
		} catch (Exception e) {
			System.out.println("Data Insert Failed " + e.getMessage());
		}

	}

	public void updateStudent(Student student) {
		try {
			Connection con = DbConnection.createConnection();
			String sql = "update  student  set email=? where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, student.getEmail());
			stmt.setInt(2, student.getId());
			stmt.executeUpdate();
			System.out.println("Data Updated Success !!!! ");

		} catch (Exception e) {
			System.out.println("Data Update Failed " + e.getMessage());
		}
	}

	public void deleteStudent(Integer id) {

		try {
			Connection con = DbConnection.createConnection();
			String sql = "delete  from student  where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.executeUpdate();

			System.out.println("Data Deleted Success !!!! ");

		} catch (Exception e) {
			System.out.println("Data Deletion failed " + e.getMessage());
		}
		// TODO : DELETE DATA BY ID.
	}

	public void getAllStudent() {
		try {
			Connection con = DbConnection.createConnection();
			String sql = "select * from student";
			PreparedStatement stmt = con.prepareStatement(sql);
			// execution
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getString("id") + " " + rs.getString("fname") + "  " + rs.getString("lname")
						+ "  " + rs.getString("email"));

			}

		} catch (Exception e) {
			System.out.println("Unble to retrive data " + e.getMessage());
		}

	}

}
