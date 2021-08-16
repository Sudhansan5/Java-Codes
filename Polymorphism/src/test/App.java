package test;

public class App {

	public static void main(String[] args) {
		Vehicle obj1 = new Vehicle();
		obj1.stop();
//		obj1.sell(); // Not allowed
		
		Vehicle obj2 = new Car();
		obj2.stop();
		obj2.start();
//		obj2.sell();   // Not allowed
		
		Car obj3 = new Car();
		obj3.stop();
		obj3.sell();
		Car obj4 = (Car)obj1;  
		obj4.start();
//		Car obj4 = new Vehicle();  // Not allowed
		
		

	}

}
