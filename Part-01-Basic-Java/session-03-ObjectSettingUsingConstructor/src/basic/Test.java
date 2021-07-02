package basic;

public class Test {
	
	public static void main(String[] args) {
		
	Employee e1=new Employee(1L, "Lilly", "lily@gmail.com");
	Employee e2=new Employee(2L, "Sagar", "Sagar@gmail.com");
	Employee e3=new Employee(3L, "Santosh", "tureraosantosh@gmail.com");
	Employee e4=new Employee(4L, "Satish", "satish@gmail.com");
	

	
	System.out.println("*******************************");
	e1.setName("Lily");
	e1.show();
	System.out.println("*******************************");
	e2.show();
	System.out.println("*******************************");
	
	e4.printHello();
		
	}

}
