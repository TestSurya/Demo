package OOPSJAVA;

public class MethodOverLoading_ex {
	
	public void add() {//No parameter 
	
		System.out.println("No Parameters");
	}
	public void add(int a) {// one parameter
		
		System.out.println(a);
	}

	public void add(int a,int b) {// one parameter
		
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
	
		MethodOverLoading_ex obj=new MethodOverLoading_ex();
		obj.add();
		obj.add(8);
		obj.add(9, 10);
		
		
		
		
	}

}
