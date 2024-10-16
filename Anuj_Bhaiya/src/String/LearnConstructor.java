package String;

public class LearnConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Complex num1 = new Complex(2,4);
		  Complex num2 = new Complex(9,7);
		  num1.print();
		  num2.print();
		  System.out.println("adding two numbers");
		  Complex result = num2.add(num1);
		  System.out.println(num1);
		  result.print();
		  

	}

}


class Complex{
	int a, b;
	
//	public Complex() {
//		a = 5;
//		b = 9;
//		System.out.println("Creating a new Object");
//	}
	public Complex(int real){
		a = real;
		b = 12;
	}
	
	public Complex(int a , int b) {
		this.a = a;
		this.b = b;
	}
	void print() {
		System.out.println(a+" + "+b+"i");
	}
	
	Complex add(Complex num2) {
		System.out.println(this);
		this.print();
		Complex newNum = new Complex(a+num2.a,b+num2.b);
		return newNum;
	}
}
