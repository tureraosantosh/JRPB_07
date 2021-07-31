package in.career.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	List<Student> findByActiveTrue();

}
