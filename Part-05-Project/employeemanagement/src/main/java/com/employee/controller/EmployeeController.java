package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.entity.Employee;
import com.employee.model.EmployeeRegistration;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/")
	public ModelAndView loadIndex() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("del")
	public String deleteEmployee(@RequestParam("id")Long id)
	{
		
		empService.deleteEmployee(id);		
		return "redirect:/emps";
	
		
		
	}

	@GetMapping("edit")
	public ModelAndView editEmployee(@RequestParam("id") Long id)
	{
		
		ModelAndView mav=new ModelAndView();
		EmployeeRegistration employeeRegistration = empService.editEmployee(id);
		mav.addObject("employeeRegistration",employeeRegistration);
		mav.setViewName("employeeRegistration");
//		employeeRegistration		
		return mav;
		
	}
	@GetMapping("/empreg")
	public ModelAndView loadEmplyeeForm() {
		ModelAndView mav = new ModelAndView();
		EmployeeRegistration employeeRegistration = new EmployeeRegistration();
		mav.addObject("employeeRegistration", employeeRegistration);
		mav.setViewName("employeeRegistration");
		return mav;
	}

	@PostMapping("/registration")
	public String saveEmployee(EmployeeRegistration employeeRegistration) {
		
		empService.saveEmployee(employeeRegistration);
		return "redirect:/emps";
	}

	@GetMapping("/emps")
	public ModelAndView getAllEmployee() {
		ModelAndView mav = new ModelAndView();
		List<EmployeeRegistration> allEmployee = empService.getAllEmployee();
		mav.addObject("employees", allEmployee);
		mav.setViewName("employeeViews");

		return mav;
	}
	
	

}
