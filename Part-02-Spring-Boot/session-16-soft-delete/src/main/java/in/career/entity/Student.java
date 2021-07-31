package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String stream;
	//flag for soft delete 
	private boolean active=true;
	
	public Student(String firstName, String lastName, String stream) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.stream = stream;
	}
	
	
	

}
