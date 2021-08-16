package multithreading;

class A extends Thread {
	public void hi() {   
		System.out.println("hi####################");
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();

	}

}
