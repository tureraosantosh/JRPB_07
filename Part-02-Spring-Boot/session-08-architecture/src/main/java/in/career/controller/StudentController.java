package in.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/greet")
	public String greet()
	{
		String msg="hello All ";
		
		return msg;
	}
	
	@GetMapping("/welcome")
	public String satish()
	{
		String msg="Welcome Satish";
		return msg;
	}
	
	@GetMapping("/info")
	public String getInfo()
	{
		
		String msg="Information About Company";
		return msg;
	}

}
