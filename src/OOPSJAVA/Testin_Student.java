package OOPSJAVA;

public class Testin_Student {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setRollNo(89876);
		obj.setName("Selenium guy");
		obj.setCity("Hyderabad");
		obj.setHeight(5.8f);
		System.out.println(obj.getRollNo());
		System.out.println(obj.getName());
		System.out.println(obj.getCity());
		System.out.println(obj.getHeight());
		
	}

}
