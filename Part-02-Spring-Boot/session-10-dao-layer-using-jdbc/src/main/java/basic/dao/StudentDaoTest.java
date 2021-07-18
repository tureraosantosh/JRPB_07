package basic.dao;

public class StudentDaoTest {
	
	public static void main(String[] args) {
		
		StudentDao studentDao=new StudentDao();
		
		Student student=new Student(101, "Lily", "S", "lily@gmail.com");
		
		studentDao.saveStudent(student);
	}

}
