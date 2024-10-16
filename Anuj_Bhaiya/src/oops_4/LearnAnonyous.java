package oops_4;

public class LearnAnonyous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		walkable walkAble = (int steps) -> {
			System.out.println("Walked "+steps+" Steps");
			return steps;
		};
		walkAble.walks(5);
		
		walkable obj2 = (steps) -> 2*steps;
		
		System.out.println(obj2.walks(8));
		
	}
//	class InnerClass extends OuterClass {
//		
//	}
	
	OuterClass obj = new OuterClass() {
		void sing() {
			
		}
		
		public void outerMethod() {
			
		}
		
	};
	
	SuperInterface obj2 = new SuperInterface() {
		public void interfaceMethod() {
			
		}
	};
	
	SuperInterface obj3 = () -> {
		
	};
	
	
	
	
}


interface walkable {
	int walks(int steps);
}

class OuterClass {
	public void outerMethod() {
			
	}
}


@FunctionalInterface
interface SuperInterface {
	void interfaceMethod(); 
}


