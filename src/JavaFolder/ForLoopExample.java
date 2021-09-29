package JavaFolder;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		//for(int i=1;i<=10;i++)
//System.out.println(i);
		Scanner i = new Scanner(System.in);
		System.out.println ("Enter the number for which you need the multiplication table = ");
		int a= i.nextInt();
		System.out.println ("The mutliplication table ");
for (int x=1;x<=10;x++)
{
	int y;
	y=a*x;
	
	System.out.println(a+"*"+x +"="+ y);
}
}
}