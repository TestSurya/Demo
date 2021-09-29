package JavaFolder;

public class Hello2 {

	
	int AA=100;
	int BB=66;
	static int CC=600;
	static int DD=800;
	
	
	
	public static void main(String[] args) {
		
		//WE can use c,d directly using class name but a,b can be used using creating objectclassname

		System.out.println("Static variables of Hello1 "+Hello1.c);
		System.out.println("Static variables of Hello1 "+Hello1.d);
		
		Hello1 Newobj = new Hello1();
		System.out.println("non local & non static of Hello1 "+Newobj.a);
		System.out.println("non local & non static of Hello1 "+Newobj.b);

		int XX=79;
		int YY=900;
		
		Hello2 obj2= new Hello2();
		System.out.println("Local variables of Hello2"+"\n"+XX+"\n"+YY+"\n"+"non local & non static of Hello2"+"\n"+obj2.AA+"\n"+obj2.BB+"\n"+"Static variables of Hello2"+"\n"+CC+"\n"+DD);
	
	}

}
