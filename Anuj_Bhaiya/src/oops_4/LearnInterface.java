package oops_4;

public class LearnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey monkey = new Monkey();
		monkey.eats();
		monkey.drink();
		System.out.println(Animal.Legs);
		
	}
	
}


interface Pet {
	void sing(); 
	void drink();
}

interface Animal {
	
	/*public static final*/ int Legs = 4;
	void eats();
	void drink();
	default void walk() {
		System.out.println("Animal is walking");
	}
}

class Monkey implements Animal, Pet {
	public void eats() {
		System.out.println("Monkey is Eating");
	}
	
	public void sing() {
		System.out.println("Monkey is Singing");
	}
	
	public void drink() {
		System.out.println("Monkey is driking");
	}
}