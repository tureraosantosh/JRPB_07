package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
	
	@Id
	private Long id;
	private String name;
	private String email;
	
	//zero argument constructor
	//all args
	//getter setter
	//tostring

}
