package CollectionsPrograms;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hyundai");
		list.add("Maruthi");
		list.add("Tata");
		
		System.out.println("\n"+"Creating in list "+list);
	
		list.add(1, "skoda");// Adding in List
		System.out.println("\n"+"Adding in List "+list);
		
		list.set(1, "Ford");//Replacing
		
		System.out.println("\n"+"Replacing in List "+list);
		
		list.remove(1);//Removing
		
		System.out.println("\n"+"Removing in List "+list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(25);
		list1.add(56);

		System.out.println("\n"+"Creating integer List "+list1);
	}

}
