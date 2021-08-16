
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		//HashMap  ---- random order
		System.out.println("HashMap");
		HashMap<String,Integer> emp = new HashMap<String,Integer>();
		
			emp.put("Sudhanshu",1);
			emp.put("Saket",2);
			emp.put("Niket",3);
	
		for(Map.Entry<String, Integer> m:emp.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
		// Linked HashMap --- maintains order in which it is entered
		System.out.println("Linked HashMap");
		LinkedHashMap<String,Integer> emp2 = new LinkedHashMap<String,Integer>();
		emp2.put("Sudhanshu",1);
		emp2.put("Saket",2);
		emp2.put("Niket",3);
		emp2.put(null,3);
		for(Map.Entry<String, Integer> m:emp2.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}

		// TreeMap --- natural order e.g. alphabetically
		System.out.println("Tree Map");
		TreeMap<String,Integer> emp3 = new TreeMap<String,Integer>();
		emp3.put("Sudhanshu",1);
		emp3.put("Saket",2);
		emp3.put("Niket",3);
//		emp3.put(null,3);     null not allowed in TreeMap
		for(Map.Entry<String, Integer> m:emp3.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}

}
