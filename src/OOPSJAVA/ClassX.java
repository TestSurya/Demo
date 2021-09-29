package OOPSJAVA;

 public class ClassX extends FinalMethodExample{
	public void add() {//87
		int a,b;
		a=7;
		b=80;
		System.out.println(a+b);
	}
	
	public void sub() {//540
		int a,b;
		a=600;
		b=60;
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
	
		ClassX obj = new ClassX();
	
		obj.add();
		obj.sub();
		
		
	}

}
