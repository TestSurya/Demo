package JavaFolder;

public class DebugExample {
	
	public void add() {
		int x=100;
		int y=80;
		int z=x+y;
		System.out.println(z);
	}
	
	public void sub() {
		int xx=100;
		int yy=80;
		int zz=xx-yy;
		System.out.println(zz);
	}
	
	
	public static void main(String[] args) {
		DebugExample obj = new DebugExample();
		
		int a =10;
		int b=8;
		int c = a*b;
		System.out.println(c);
		obj.add();
		obj.sub();
		
	}

}
