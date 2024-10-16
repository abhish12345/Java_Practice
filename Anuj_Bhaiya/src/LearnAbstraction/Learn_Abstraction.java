package LearnAbstraction;

//abstract class Animal{
//	abstract void walk();
//	Animal() {
//		System.out.println("You are creating a new animal");
//	}
//	public void eats() {
//		System.out.println("Animal eats");
//	}
//		
//	
//}
//
//class Horse extends Animal {
//	Horse(){
//		System.out.println("Created a Horse");
//	}
//	public void walk() {
//		System.out.println("Walks on 4 legs");
//	}
//}
//
//class Chicken extends Animal {
//	public void walk() {
//		System.out.println("Walks on 2 legs");
//	}
//}

//interface Animal {
//	int eyes = 2;
//	void walk();
//	//void eat();
//}
//
//interface Herbivore {
//	
//}
//
//class Horse implements Animal,Herbivore {
//	public void walk() {
//		System.out.println("walks on 4 legs");
//	}
//}



class Student {
	String name;
	static String school;
	
	public static void changeSchool() {
		school = "newschool";
	}
}

public class Learn_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Horse horse = new Horse();
//		horse.walk();
//		horse.eats();
		
		//Animal animal = new Animal();
//		Horse horse =new Horse();
//		horse.walk();
		
		Student.school = "GBPS";
		Student Student1 = new Student();
		Student1.name = "tony";
		System.out.println(Student.school);

	}

}
