package basic.dao;

public class StudentDaoTest {
	
	public static void main(String[] args) {
		
		StudentDao studentDao=new StudentDao();
		
		Student student=new Student(1, "Lily", "S", "lily@gmail.com");
		
		studentDao.getAllStudent();
	}

}
