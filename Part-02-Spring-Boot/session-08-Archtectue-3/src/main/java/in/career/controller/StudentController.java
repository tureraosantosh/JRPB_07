package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.career.bindings.Student;

@Controller
public class StudentController {

	@GetMapping("/loadForm")
	public ModelAndView getStudent() {
		ModelAndView mav = new ModelAndView();

		Student student = new Student();
		mav.addObject("student", student);
		mav.setViewName("student");
		return mav;

	}

	@PostMapping("save")
	public ModelAndView saveStudent(Student student) {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("success");
		mav.addObject("student", student);
		System.out.println(student);

		return mav;
	}

}
