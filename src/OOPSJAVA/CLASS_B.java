package OOPSJAVA;

public class CLASS_B extends CLASS_A{
	
		public   void mul() {
			int a=8;
			int b=5;
			System.out.println("Mul = "+(a*b));
		}

	public void div() {
		int x=17;
		int y=8;
		System.out.println("Div = "+(x/y));
	}
	
	
	
	public static void main(String[] args) {
		
//		CLASS_A.add();//method 1 directly declaring static method
//		CLASS_A obj = new CLASS_A();// creating obj for method sub
//		obj.sub();//accessing method using object

	CLASS_B obj =new CLASS_B();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
		
		
		
	}

}
