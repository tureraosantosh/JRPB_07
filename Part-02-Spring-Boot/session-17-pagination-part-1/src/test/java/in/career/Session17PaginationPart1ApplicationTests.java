package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.career.entity.Employees;
import in.career.repo.EmployeeRepo;

@SpringBootTest
class Session17PaginationPart1ApplicationTests {

	@Autowired
	private EmployeeRepo empRepo;
	
	
	@Test
	public void saveEmployee()
	{
		Employees emp1=new Employees(106L, "Lily", "Product", "Software Engineer", 35000, "Navi Mumbai");
		
		empRepo.save(emp1);
	}

	@Test
	public void testPagableEmployee() {
		int pageNo = 0;
		int pageSize = 2;
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<Employees> findAll = empRepo.findAll(pageRequest);
		
		List<Employees> content = findAll.getContent();
		
		System.out.println(content);
		
		System.out.println(findAll);

	}
}
