package OOPSJAVA;

public class Sample2_Abstract extends Sample_Abstract {

	public void sub() {
		int a=9;
		int b=8;
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
	
		Sample2_Abstract obj = new Sample2_Abstract();
		 obj.sub();
		 obj.add();

	}



}
