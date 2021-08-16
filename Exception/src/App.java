
public class App {

	public static void main(String[] args) {
		Divide d1 = new Divide();
		try {

			System.out.println("try block working");
			d1.divider();
			System.out.println("try block working again!!");
		} catch (DivException e) {
			System.out.println(e.getMessage());
		}

	}

}
