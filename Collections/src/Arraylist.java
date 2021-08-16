import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arr.add(i);
		}
		System.out.println("Remove: "+arr.remove(3));
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
