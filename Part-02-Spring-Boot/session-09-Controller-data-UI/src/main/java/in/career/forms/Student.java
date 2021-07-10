package in.career.forms;

public class Student {
	
	private String userName;
	private String password;
	private String email;
	
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Student [userName=" + userName + ", password=" + password + "]";
	}
	

}
