package basic;

public class Employee {
	
	private String empId;
	private String empName;
	private int salary;
	
	public void setEmpId(String e)
	{
		//
		empId=e;
	}
	
	public void setEmpName(String em)
	{
		empName=em;
	}
	
	public void setSalary(int s)
	{
		salary=s;
	}
	
	public void display()
	{
		System.out.println("EmpId :: "+empId);
		System.out.println("EmpName :: "+empName);
		System.out.println("salary :: "+salary);
		
	}

}
