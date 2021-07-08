package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@GetMapping("/emp")
	public ModelAndView loadEmployeeForm()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("title", "Employee Registration Form");
		mav.setViewName("student");
		
		return mav;
	}

}
