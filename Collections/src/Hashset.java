import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {

		// HashSet -----random order
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		System.out.println(fruits);

		// LinkedHashSet ----- maintains order in which it is entered
		LinkedHashSet<String> fruits2 = new LinkedHashSet<String>();
		fruits2.add("Mango");
		fruits2.add("Apple");
		fruits2.add("Banana");
		fruits2.add("Grapes");
		System.out.println(fruits2);

		// TreeSet ----- natural order e.g. alphabetically
		TreeSet<String> fruits3 = new TreeSet<String>(fruits);
		System.out.println(fruits3);
		
//		fruits3.add("Mango");
//		fruits3.add("Apple");
//		fruits3.add("Banana");
//		fruits3.add("Grapes");
//		System.out.println(fruits3);
		
	}

}
