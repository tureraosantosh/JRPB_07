package basic;

public class Student {	
	//Data Members.
	//access

	public String firstName;
	public String lastName;
	public String email;
	public int age;	
	//Method
	public void displayStudentInfo()
	{
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Email : "+email);
		System.out.println("age : "+age);
	}
	
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.firstName="Lilly";
		s1.displayStudentInfo();
	
	}

}
