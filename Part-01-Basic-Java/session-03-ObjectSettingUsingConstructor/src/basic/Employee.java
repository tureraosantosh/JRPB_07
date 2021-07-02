package basic;

public class Employee {

	private Long id;
	private String name;
	private String email;

	public Employee() {

		System.out.println("Object Created");

	}

	// param/argument
	public Employee(Long i, String n, String e) {
		id = i;
		name = n;
		email = e;

	}

	public void setId(Long i) {
		id = i;
	}

	public void setName(String n) {
		name = n;
	}

	public void setEmail(String e) {
		email = e;
	}

	public void show() {
		System.out.println("Id  " + id);
		System.out.println("Name " + name);
		System.out.println("email   " + email);
	}

	public void printHello() {
		System.out.println("Hello Lily");
	}

}
