import java.util.HashSet;
import java.util.Set;

public class ComparableExample implements Comparable<ComparableExample> {
	private int id;
	private String name;

	ComparableExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComparableExample [id=" + id + ", name=" + name + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComparableExample other = (ComparableExample) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(ComparableExample o) {
		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
		Set<ComparableExample> emp = new HashSet<ComparableExample>();
//		Set<ComparableExample> emp = new TreeSet<ComparableExample>();
		emp.add(new ComparableExample(1, "Sudhanshu"));
		emp.add(new ComparableExample(3, "Saket"));
		emp.add(new ComparableExample(2, "Niket"));
		emp.add(new ComparableExample(1, "Rakshit"));
		for (ComparableExample e : emp) {
			System.out.println(e);
		}
	}

}

