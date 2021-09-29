package JavaFolder;

public class UserDefinedMethod {
	static int a=10;
	static int b=20;
	public  void add ()//This is user defined method created outside of main and need to create obj to call this in main
	{
		int c=a+b;
	System.out.println(c);			
	}
	public static void sub() {//made this method static can be used without object
		int d=a-b;
		System.out.println(d);
	}
	
	
	
	public static void main(String[] args) {

		UserDefinedMethod obj = new UserDefinedMethod();
		obj.add();
		System.out.println("hello");
		sub();
		
		
	}

}
