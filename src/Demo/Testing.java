package Demo;

import JavaFolder.PublicClassExample;

public class Testing {

	public static void main(String[] args) {
		int a=8;
	//	PrivateExample obj= new PrivateExample();//Cannot be used since PrivateExample is in other package
		PublicClassExample obj = new PublicClassExample();// We have created as Public so can be used in anywhere in project
		System.out.println(obj.a);
		obj.add();
		
		
		
	}

}
