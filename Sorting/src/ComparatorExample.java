import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ListSort implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return 1;
		} else if (o2 > o1) {
			return -1;
		}
		return 0;
	}

}

class Employee {
	private int id;
	private String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(5);
		li.add(3);
		Collections.sort(li, new ListSort());
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Employee obj1 = new Employee(1, "Sudhanshu");
		Employee obj2 = new Employee(3, "Saket");
		Employee obj3 = new Employee(2, "Niket");
		emp.add(obj1);
		emp.add(obj2);
		emp.add(obj3);
		Collections.sort(emp, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		for (Employee i : emp) {
			System.out.println(i);
		}

	}

}
