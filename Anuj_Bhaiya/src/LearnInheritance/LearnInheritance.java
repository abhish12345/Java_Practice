package LearnInheritance;

class Shape {
//	String color;
	public void area() {
		System.out.println("displays area");
	}
}

class Triangle extends Shape {
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}

//class EquilateralTriange extends Triangle {
//	public void area(int l, int h) {
//		System.out.println(1/2*l*h);
//	}
//}


class Circle extends Shape {
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}

public class LearnInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Triangle t1 = new Triangle();
//		t1.color = "red";
	}

}
