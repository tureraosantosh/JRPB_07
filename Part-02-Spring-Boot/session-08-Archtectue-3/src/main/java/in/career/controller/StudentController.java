package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView mav = new ModelAndView();
		// data
		mav.addObject("name", "Santosh");
		mav.addObject("lastName", "Turerao");
		

		// view name
		mav.setViewName("student");

		return mav;

	}

}
