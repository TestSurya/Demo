package OOPSJAVA;

public class SBI implements Bank{

	public float LoanAmount() {
	return 5000.50f;	
	}
	public static void main(String[] args) {
		
		SBI obj=new SBI();
		System.out.println(obj.LoanAmount());
		
		
	}

}
