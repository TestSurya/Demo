package CollectionsPrograms;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_example {

	public static void main(String[] args) {
		

				Hashtable<Integer,String> map = new Hashtable<Integer,String>();
				
				map.put(1, "Surya")	;
				map.put(2, "BIKE");
				map.put(3, "IS");
				map.put(4, "RE");

				
				for(Map.Entry names : map.entrySet()) {
					System.out.println(names.getKey()+" : "+ names.getValue());

	}

	}
}
