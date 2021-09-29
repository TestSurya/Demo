package OOPSJAVA;

public class classd extends classc{

	public void muld() {
		int a=8;
		int b =9;
		System.out.println(a*b);
	}
	public void divd() {
		int z=3;
		int g=9;
		System.out.println(g/z);
	}
	public static void main(String[] args) {
		 classd obj = new classd();
		 obj.muld();
		 obj.divd();
		 obj.addC();
		 obj.subC();
		 obj.mul();
		 obj.div();
		 obj.add();
		 obj.sub();

	}

}
