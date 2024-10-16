package oops_3LearnEncapsulation;

import oops_3LearnPackage.Person;

public class MainInEncapsulation {
	
	public static void printHello() {
		//System.out.println("Hello");
		//printHi()
}
	
	
//	public void printHi() {
//		System.out.println("Hi");
//		//printHello();
//	}
	
	static {
		System.out.println("called from the static block");
	}

	public static void main(String[] args) {
		
		MainInEncapsulation.printHello();
		
		 System.out.println("From main method");
		
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setAge(12);
		//System.out.println(p1.getAge());
		
//		p1.count = 50;
		
		
		Person p2 = new Person();
		
		Person p3 = new Person();
		
		
		System.out.println(Person.count);
		
//		
//		System.out.println(Math.max(3, 6));
//		static {
//			System.out.println("second");
//		}
	}
	static {
		System.out.println("second");
	}
	

}
