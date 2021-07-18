package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // it will creat table in db
public class Teacher {
	
	@Id // primary key
	private Integer id;
	private String name;
	private String email;
	private String address;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
