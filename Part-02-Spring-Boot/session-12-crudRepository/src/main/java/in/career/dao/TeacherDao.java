package in.career.dao;

import org.springframework.data.repository.CrudRepository;

import in.career.entity.Teacher;

public interface TeacherDao extends CrudRepository<Teacher, Long> {

}
