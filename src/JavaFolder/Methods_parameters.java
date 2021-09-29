package JavaFolder;

public class Methods_parameters {

	public void add() {
		int a =8;//declaring variables inside of method
		int d=9;
		System.out.println(a+d);
	}
	
	public static void sub(int a,int b) {//parameters a,b are arguments
	
	
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		 Methods_parameters obj=new Methods_parameters();
		 obj.add();//normal
		sub(2,6);//parameters
	}

}
