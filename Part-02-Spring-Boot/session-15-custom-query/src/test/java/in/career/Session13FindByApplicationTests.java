package in.career;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import in.career.dao.EmployeeRepo;
import in.career.entity.Employee;

@SpringBootTest
class Session13FindByApplicationTests {

	@Autowired
	EmployeeRepo empRepo;
	
	@Test
	public void testFilteredEmployee()
	{
		Employee emp=new Employee();	
		emp.setEmail("satish@gmail.com");
		Example<Employee> exampleEmployee = Example.of(emp);		
		List<Employee> findAll = empRepo.findAll(exampleEmployee);
		System.out.println(findAll);
	}
	
	@Test
	public void testSortEmployee()
	{
		Employee emp=new Employee();
		Sort.DEFAULT_DIRECTION;
		empRepo.findAll(sort);
	}
	
	@Test
	public void testCustomQueryGetAllEmployees()
	{
		List<Employee> allEmployees = empRepo.getAllEmployees();
		System.out.println(allEmployees);
	}
	
	
	@Test
	public void testSave()
	{
		Employee e1=new Employee(2L, "Satish", "Product", "satish@gmail.com", "9967120080", "Product", 250000);
		
		empRepo.save(e1);
	}
	
	@Test
public void testNullPointerExcptionForFindByEmail()
{
	Optional<Employee> findByEmail = empRepo.findByEmail("san@gmail.com");
	
	if(findByEmail.isPresent()) {
		System.out.println(findByEmail.get());
	}
	
	

	
	
}
	@Test
	public void testFindByEmail()
	{
	Optional<Employee> findByEmail = empRepo.findByEmail("santosh@gmail.com");
	
//	System.out.println("Data FindByEmail MEthod "+emp);
	}
	
	@Test
	public void testFindByDepartment()
	{
	List<Employee> productWiseEmployeeList=	empRepo.findByDepartment("Product");
	System.out.println("*********************product List ********************************");
	System.out.println(productWiseEmployeeList);
	System.out.println("*********************product List ********************************");
	}

}
