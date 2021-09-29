package JavaFolder;

public class VariableTypes {
	
	int c=2;//instance Variables
	int d=0;//instance Variables
	
	static int x=80;//Static Variables
	static int y=77;//Static VAriables
	public static void main(String[] args) {
		
		int A=8;// Local Variables
		int B=7; // Local Variables
		
		System.out.println(A);
		System.out.println(B);
		
		VariableTypes obj=new VariableTypes(); //Object for Instance Variable
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		System.out.println(VariableTypes.x);//No object required for Static Variable
		System.out.println(VariableTypes.y);
	}

}
