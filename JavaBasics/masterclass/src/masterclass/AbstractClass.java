package masterclass;

import java.util.Scanner;

public class AbstractClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String[] types=value.split("[, |]");
		for (String type:types)
			System.out.println(type);
	}

}
