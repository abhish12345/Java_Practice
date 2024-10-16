package oops_3LearnPackage;

//import oops_3LearnEncapsulation.MainInEncapsulation;

public class Person {
	
	public static int count = 0;
	
	public Person() {
		count++;
	}

	/*private*/ public int age;
	private String name;
	
	
	boolean canBeChanged = true ;
	
	public void setAge(int age) {
		if(canBeChanged) {
		this.age = age;
		}
	}
	
	boolean canBeAccessed = false; 
	
	public int getAge() {
		if(canBeAccessed)return age;
		return -1;
		
		
		MainInEncapsulation.printHello();
	}
	
}
