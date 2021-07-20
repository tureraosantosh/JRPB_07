package in.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.career.entity.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Long> {

}
