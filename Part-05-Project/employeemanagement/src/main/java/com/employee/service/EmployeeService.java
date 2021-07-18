package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepo;
import com.employee.entity.Employee;
import com.employee.model.EmployeeRegistration;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public boolean saveEmployee(EmployeeRegistration empReg) {
		Employee emp = new Employee();
		emp.setFirstName(empReg.getFirstName());
		emp.setLastName(empReg.getLastName());
		emp.setEmail(empReg.getEmail());
		employeeRepo.save(emp);
		return true;

	}

	public List<EmployeeRegistration> getAllEmployee() {
		List<Employee> allEmployee = employeeRepo.findAll();

		Employee employee = allEmployee.get(0);

		List<EmployeeRegistration> empRegistration = new ArrayList<EmployeeRegistration>();

		EmployeeRegistration emr = new EmployeeRegistration();
		emr.setFirstName(employee.getFirstName());
		emr.setLastName(employee.getLastName());
		emr.setEmail(employee.getEmail());
		empRegistration.add(emr);
		return empRegistration;
	}

}
