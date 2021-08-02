package in.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Employees;

public interface EmployeeRepo  extends JpaRepository<Employees, Long>{

}
