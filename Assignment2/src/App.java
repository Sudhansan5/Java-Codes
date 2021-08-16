import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	static void mapExample() {
		System.out.println("Map Example: ");
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
//		Employee obj4 = new Employee();
		obj1.setdata(1, "Sudhanshu");
		obj2.setdata(2, "Saket");
		obj3.setdata(3, "Tryambkesh");
//		obj4.setdata(1, "Sudhanshu");
		Map<Employee, String> emp = new TreeMap<Employee, String>();
		emp.put(obj1, "Java");
		emp.put(obj2, "Python");
		emp.put(obj3, "C#");
//		emp.put(obj4, "C#");
		for (Employee e : emp.keySet()) {
			System.out.println(e + ": " + emp.get(e));
		}
	}

	static void setExample() {
		System.out.println("Set Example: ");
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		obj1.setdata(1, "Sudhanshu");
		obj2.setdata(2, "Saket");
		obj3.setdata(3, "Tryambkesh");

		Set<Employee> emp = new TreeSet<Employee>();
		emp.add(obj1);
		emp.add(obj2);
		emp.add(obj3);
		System.out.println(emp);
	}

	public static void main(String[] args) {

		mapExample();
		System.out.println();
		setExample();
	}

}
