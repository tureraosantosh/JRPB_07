package basic;

public class AllMethodExample {
	
	public static void main(String[] args) {
		
//		printName();
		printName("Lily");
		int ans=getAddition(5,6);
		System.out.println(ans);
		
		
	}
	
	
	public static void printName() {
		System.out.println("Hi This is Santosh");
	}
	
	public static void printName(String name) {
		System.out.println("Welcome "+name +"!");
	}

	//sub,div,mul
	public static int  getAddition(int num1,int num2)
	{
		return num1+num2;
	}
}
