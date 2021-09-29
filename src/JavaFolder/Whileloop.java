package JavaFolder;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		/*int i=1;
		while(i<=10)
				{
			
			System.out.println(i);
			i++;
		}*/
		//int a=2;
		System.out.println("Enter the value of a");
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		/*int x=1;
		while(x<=10)
		{
		int y;
		y=a*x;
		
		System.out.println(a+"*"+x +"="+ y);
		x++;
		}*/
		
		int x=10;
		while(x>=1)
		{
		int y;
		y=a*x;
		
		System.out.println(a+"*"+x +"="+ y);
		x--;
		}
	}

	}


