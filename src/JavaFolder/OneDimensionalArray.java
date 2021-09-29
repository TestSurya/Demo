package JavaFolder;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		System.out.println("declare First and assign later");
		int [] A=new int[5];
		A[0]=10;
		A[1]=20;
		A[2]=30;
		A[3]=40;
		A[4]=50;
System.out.println("\n"+"Int values");
System.out.println(A[0]);	
System.out.println(A[1]);	
System.out.println(A[2]);
System.out.println(A[3]);	
System.out.println(A[4]);	

byte [] B=new byte [5];
B[0]=1;
B[1]=2;
B[2]=3;
B[3]=4;
B[4]=5;
System.out.println("Byte values");
System.out.println(B[0]);	
System.out.println(B[1]);	
System.out.println(B[2]);
System.out.println(B[3]);	
System.out.println(B[4]);	

double [] D=new double[5];
D[0]=1.1;
D[1]=2.2;
D[2]=3.3;
D[3]=4.4;
D[4]=5.5;
System.out.println("Double values");
System.out.println(D[0]);	
System.out.println(D[1]);	
System.out.println(D[2]);
System.out.println(D[3]);	
System.out.println(D[4]);	

System.out.println("\n"+"declare and assign at same time");

int [] X= {100,200,300};
System.out.println(X[0]);
System.out.println(X[1]);
System.out.println(X[2]);
		

	}

}
