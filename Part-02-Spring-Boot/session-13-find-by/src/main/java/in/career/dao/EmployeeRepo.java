package in.career.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {	
	Employee findByEmail(String email);	
	Employee findByMobile(String mobile);	
	List<Employee> findByDepartment(String department);
}
