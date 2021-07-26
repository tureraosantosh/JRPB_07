package in.career.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.career.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {	
	Optional<Employee> findByEmail(String email);	
	Employee findByMobile(String mobile);	
	List<Employee> findByDepartment(String department);
	
	//select id,email,mobile,salary,desgination from employee e
	//select emp.id,emp.email,emp.mobile,emp.salary  from Employee emp;
	//from Employee;
	@Query("from Employee")
	List<Employee> getAllEmployees();
	
}
