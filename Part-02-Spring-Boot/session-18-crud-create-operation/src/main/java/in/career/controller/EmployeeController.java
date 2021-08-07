package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	//localhost:8080/
	//url pattern
	@GetMapping("/")	
	public String loadIndex()
	{
		
		//logical view name
		return "index";
	}

}
