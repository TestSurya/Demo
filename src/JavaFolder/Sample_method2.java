package JavaFolder;

public class Sample_method2 {
	static int a=8;
	static int b=3;
	public  void add1 ()
	{ 
		int c=a+b;
	System.out.println(c);			
	}
	public static void sub1() {//made this method static can be used without object
		int d=a-b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Sample_Method1 obj=new Sample_Method1();
		System.out.println("Calling Sample_method1 in Sample_method2");
		obj.add();
		
		System.out.println("Calling Sample_method1 in Sample_method2");
		Sample_Method1.sub();
		
		Sample_method2 obj2=new Sample_method2();
		System.out.println("Sample_method2");
		obj2.add1();
		System.out.println("Sample_method2");
		sub1();
		
	}

}
