
public class Singleton {
	private static Singleton val=null;
	private String s;
	private Singleton() {
		s="Hi";
		System.out.println("Example of singleton class");
	}
	
	public static Singleton getInstance() {
		if(val==null) {
			val = new Singleton();
		}
		return val;
	}
	
	
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		System.out.println(obj.s);
	}

}
