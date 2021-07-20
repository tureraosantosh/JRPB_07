package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.dao.EmployeeRepo;
import in.career.entity.Employee;

@SpringBootTest
class Session13FindByApplicationTests {

	@Autowired
	EmployeeRepo empRepo;
	
	
	@Test
	public void testSave()
	{
		Employee e1=new Employee(2L, "Satish", "Product", "satish@gmail.com", "9967120080", "Product", 250000);
		
		empRepo.save(e1);
	}
	

	@Test
	public void testFindByEmail()
	{
	Employee emp=empRepo.findByEmail("santosh@gmail.com");
	
	System.out.println("Data FindByEmail MEthod "+emp);
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
