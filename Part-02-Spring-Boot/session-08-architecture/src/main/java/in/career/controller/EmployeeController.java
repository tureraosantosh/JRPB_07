package in.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/emp")
	public String getEmployeeName()
	{
		String name="satish Kumar";
		return name;
	}
	
	@GetMapping("/salary")
	public String getSalary()
	{
		String msg="Salary is 10000010";
		return msg;
	}

}
