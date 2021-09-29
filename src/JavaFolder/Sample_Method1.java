package JavaFolder;

public class Sample_Method1 {
	static int a=8;
	static int b=3;
	public  void add ()
	{ 
		int c=a+b;
	System.out.println(c);			
	}
	public static void sub() {//made this method static can be used without object
		int d=a-b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		sub();

	}

}
