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
public class Employee {
	@Id
	private Long id;
	private String name;
	private String desgination;
	private String email;
	private String mobile;
	private String department;
	private Integer salary;

}
