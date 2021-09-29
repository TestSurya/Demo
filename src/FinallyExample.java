
public class FinallyExample {

	public static void main(String[] args) {
		try {
			int a= 10;
			System.out.println(a/0);
		}
//		catch(ArithmeticException e) {
//			System.out.println("Here is an exception");
//			
//		}


		finally {
			System.out.println("Finally block executes irrespective of Exception");
			int s=19;
			int x =9;
			System.out.println(s*x);
		}
	}

}
