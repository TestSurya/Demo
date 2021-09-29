package OOPSJAVA;

public class Sample2_interface implements Sample1_Interface{
 public void add() {
	 System.out.println("Add method implemented");
 }
 public void sub() {
	 System.out.println("Sub method implemeted");
 }
 public void mul() {
	 System.out.println("Mul mehtod implemented");
 }
	public static void main(String[] args) {

		Sample2_interface obj = new Sample2_interface();
		obj.add();
		obj.sub();
		obj.mul();

	}

}
