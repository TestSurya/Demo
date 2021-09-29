package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	

	public static void main(String[] args) {


		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Surya")	;
		map.put(2, "BIKE");
		map.put(3, "IS");
		map.put(4, "RE");

		
		for(Map.Entry names : map.entrySet()) {
			System.out.println(names.getKey()+" : "+ names.getValue());
		
		
		
		
		
//		int b=map.size();
	
//	for(int i=1;i<=b;i++) {
//		System.out.print(" "+map.get(i));
	}
	
	}
	
}
