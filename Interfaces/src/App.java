
public class App {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.hardWork();
		s1.showInfo("Sudhanshu");

		Player p1 = new Player();
		p1.showInfo();
		p1.hardWork();

		Behaviour b1 = new Student();
		b1.hardWork();
//		b1.showInfo("Sudhanshu");  // Not allowed
	}

}
