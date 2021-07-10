package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.career.forms.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		Student student=new Student();		
		mav.addObject("student", student);		
		mav.setViewName("student");
		return mav;
	}
	
	@PostMapping("save")
	public ModelAndView saveStudent(Student student)
	{
		System.out.println(student);
		ModelAndView mav=new ModelAndView();
		mav.addObject("std", student);
		mav.setViewName("success");
		
		return mav;
		
		
	}
	
	

}
