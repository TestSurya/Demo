package JavaFolder;

public class Hello1 {

	int a=8;//Non Local non Static variables, we need to declare Obj with class name to access them
	int b=4;
	
	static int c=9;
	static int d=5;//Static variables can be accessed anywhere
			
	
	public static void main(String[] args) {

		int x=1;
		int y=3;//Local variables
		System.out.println("Local variables "+x);
		System.out.println("Local variables "+y);//For local
		
		Hello1 obj = new Hello1();
		System.out.println("non local & non static "+obj.a);
		System.out.println("non local & non static "+obj.b);//For non local & non static
		
		System.out.println("Static" +c);
		System.out.println("Static" +d);//For Static
		
	}

}
