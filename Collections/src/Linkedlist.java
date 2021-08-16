import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {

		LinkedList<Integer> arr = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			arr.add(i);
		}
		System.out.println("Peek: "+arr.peek());
		System.out.println("Pop: "+arr.pop());
		System.out.println("Remove: "+arr.remove(2));
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
