package OOPSJAVA;

public class ChildMethodOverRiding_ex extends ParentMethodOverRiding_ex {
 public void add() {
	 System.out.println("I'm a method from child class");
 }
 public void div() {
	 System.out.println("I'm a child");
 }
	public static void main(String[] args) {
	//	ParentMethodOverRiding_ex obj = new ChildMethodOverRiding_ex();
		ParentMethodOverRiding_ex obj = new ParentMethodOverRiding_ex();
	
obj.add();//parent method
	}

}
