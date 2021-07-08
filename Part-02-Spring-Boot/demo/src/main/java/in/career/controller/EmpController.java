package in.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@GetMapping("/data")
	public String getData()
	{
		String msg="hi hello";
		return msg;
	}

}
