package OOPSJAVA;

public class Finalize_Example {

	

		public void add(){
		int a,b;
		a=9;b=9;
		System.out.println(a+b);

		}
		public void add(int a , int b){

		System.out.println(a+b);
		}
		public  static void main(String[] args){

			Finalize_Example obj = new Finalize_Example();
obj.add();
obj.add(4, 8);


		}
		}