package in.career;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.dao.TeacherDao;
import in.career.entity.Teacher;

@SpringBootTest
class Session12CrudRepositoryApplicationTests {

	@Autowired
	private TeacherDao teacherDao;

	@Test
	public void saveTeacher() {
		Teacher t1 = new Teacher(2L, "shreya", "pawar@gmail");
		teacherDao.save(t1);
		System.out.println("Data saved");
	}

	@Test
	public void updateTeacher() {
		Teacher t1 = new Teacher(2L, "shreya", "shreyapawar@gmail");
		teacherDao.save(t1);
		System.out.println("Data saved");
	}

	@Test
	public void showStudent() {

		Optional<Teacher> teacher = teacherDao.findById(2L);
		System.out.println(teacher.get());

	}

	@Test
	public void showAllStudent() {
		Iterable<Teacher> allStudents = teacherDao.findAll();
		System.out.println("\n**********all Students List************");
		System.out.println("all Students " + allStudents);
		System.out.println("\n**********all Students List************");

	}

	@Test
	public void deleteStudent() {
//		teacherDao.deleteById(1L);
	}

}
