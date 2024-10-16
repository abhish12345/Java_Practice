package oops_4;

public class LearnInnerClass {

	public static void main(String[] args) {
//		Toy toy = new LearnInnerClass().newToy();
		LearnInnerClass obj = new LearnInnerClass();
		Toy toy = obj.new Toy();
		toy.price = 45;
		// TODO Auto-generated method stub
		Playstation playstation = new LearnInnerClass.Playstation();
		
	}
	class Toy {
		int price;
	}
	
	static class Playstation {
		int Price;
	}
}
