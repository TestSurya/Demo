package JavaFolder;

public class typeCastingExample {

	public static void main(String[] args) {
		
		int X=70000000;
		
		//short S = X;//short is smaller than int i.e we are facing error untill we do type cast
		
		short S = (short)X;
		
		long L =X;//int is small when compared to long
	
		System.out.println(X);

		System.out.println(S);

		System.out.println(L);
	
	
	
	
	}

}
