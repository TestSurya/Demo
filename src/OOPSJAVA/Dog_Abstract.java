package OOPSJAVA;

public class Dog_Abstract extends Animal_Abstract{

public void sound() {
	System.out.println("Dog is barking");
}
public static void main(String[] args) {
	
	Dog_Abstract obj= new Dog_Abstract();
	
	obj.eat();
	
	obj.sound();
	
	
}
}