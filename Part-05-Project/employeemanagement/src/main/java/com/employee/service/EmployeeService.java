package com.employee.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
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
		emp.setId(empReg.getId());
		emp.setFirstName(empReg.getFirstName());
		emp.setLastName(empReg.getLastName());
		emp.setEmail(empReg.getEmail());
		employeeRepo.saveAndFlush(emp);
		return true;

	}
	

	public EmployeeRegistration editEmployee(Long id)
	{
		ModelMapper mapper=new  ModelMapper();
		
		Employee employee = employeeRepo.getOne(id);
		
		EmployeeRegistration EmpReg = mapper.map(employee, EmployeeRegistration.class);
		
		return EmpReg;
	
	
	}
	
	public void deleteEmployee(Long id)
	{
		employeeRepo.deleteById(id);
	}

	public List<EmployeeRegistration> getAllEmployee() {
		ModelMapper modelMapper = new ModelMapper();
		List<Employee> findAll = employeeRepo.findAll();

		// Converting EmployeeList to EmployeeRegistrationList....
		List<EmployeeRegistration> empRegistration = findAll.stream()
				.map(user -> modelMapper.map(user, EmployeeRegistration.class)).collect(Collectors.toList());

		return empRegistration;
	}

}
