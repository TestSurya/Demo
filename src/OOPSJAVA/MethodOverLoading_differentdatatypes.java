package OOPSJAVA;

public class MethodOverLoading_differentdatatypes {
	
	public void add(int a,int b) {//Two parameters 
		
		System.out.println(a);
	}

	public void add(double a,int b) {//Two parameters but different datatypes
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverLoading_differentdatatypes obj = new MethodOverLoading_differentdatatypes();
		
		obj.add(8, 7);
		obj.add(8.999999, 9);

	}

}
