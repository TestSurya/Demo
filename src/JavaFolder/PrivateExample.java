package JavaFolder;

public class PrivateExample {

	
	
	public static void main(String[] args) {
		PrivareAccessModifiers obj = new PrivareAccessModifiers();
		System.out.println(obj.a);
	//	System.out.println(obj.b);//b will be restricted since it is a private value

		obj.add();
	//	obj.sub();// will be restricted since it is a private value
	}

}
