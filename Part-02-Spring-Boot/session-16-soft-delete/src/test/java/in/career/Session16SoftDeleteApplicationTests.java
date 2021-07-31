package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.entity.Student;
import in.career.repo.StudentRepo;

@SpringBootTest
class Session16SoftDeleteApplicationTests {

	@Autowired
	private StudentRepo studentRepo;
	
	//TDD 

	@Test
	public void testSaveStudent() {
		Student s1 = new Student("Suraj", "Kumar", "CS Engineering");		
		Student save = studentRepo.save(s1);
	}
	
	@Test
	public void testHardDelte()
	{
		Long id=2L;
		studentRepo.deleteById(id);
	}

	@Test
	public void testGetAllStudentDeltedFalse() {
		List<Student> activeTrueStudents = studentRepo.findByActiveTrue();
		System.out.println(activeTrueStudents);
	}

	@Test
	public void testSoftDelete() {
		Long id = 1L;

		Student student = studentRepo.findById(id).get();
		System.out.println(student);
		student.setActive(false);
		studentRepo.save(student);

	}

}
