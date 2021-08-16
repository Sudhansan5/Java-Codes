
public class Student implements Behaviour {
	private String name;

	public void showInfo(String name) {
		this.name = name;
		System.out.println("Name of Student: " + this.name);
	}

	@Override
	public void hardWork() {
		System.out.println("Student must work hard!");
	}
}
