package in.career.formbindings;

public class UserFormBinding {
	
	public UserFormBinding() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "UserFormBinding [userName=" + userName + ", password=" + password + "]";
	}



	public UserFormBinding(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	private String userName;
	private String password;
	
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
	
	

}
