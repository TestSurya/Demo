package JavaFolder;

public class MethodReturnExample {

	public int add() {
		int a=10; int b=7;
		int c=a+b;
		return c;
			
	}
	
	public static int sub() {
		 int a=89;int b=9;
		 int c=a-b;
		 return c;
	}
	
	public static void main(String[] args) {
		MethodReturnExample obj =new MethodReturnExample();
		
		System.out.println("Add result = "+obj.add());// what is written in return of the add method will be called here
	
		System.out.println("Sub result = "+sub());
	}

}
