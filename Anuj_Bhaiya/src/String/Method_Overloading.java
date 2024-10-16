package String;

import java.util.Iterator;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet obj = new Greet();
//		obj.greetings();
//		obj.greetings("Abhishek ");
		obj.greetings("Abhishek", 5);
	}

}

class Greet{
	
	void greetings() {
		System.out.println("Hello, Good Morning");
	}
	
	void greetings(String name) {
		System.out.println("Hello "+name+", Good Morning");
}
	
	void greetings(String name, int count ) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hello "+name+", Good Morning");
		}
	}
}
