
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public void setdata(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "id=" + id + " name=" + name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode())
			return true;
		return false;
	}

	@Override
	public int compareTo(Employee o) {

		return name.compareTo(o.name);
	}

}
