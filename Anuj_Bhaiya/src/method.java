
public class method {

	public static void main(String[] args) {
//		return; 
		// TODO Auto-generated method stub
//		System.out.println(1);
//		System.out.println(2);
//		greet();
//		System.out.println(5);
//		System.out.println(6);
//		average(4,6,true);
		
		int averageFraomFunction = average(4,6,false);
		System.out.println(averageFraomFunction);
		System.out.println("Hello");
		average(2,7,false);
	}
	
	public static void greet() { 
		System.out.println(3);
		System.out.println("Hello World");
		System.out.println(4);
		return;
	}
	
	
	
	
	public static int average(int a, int b, boolean shouldAverage) {
		if(shouldAverage==false) {
			return -1;
		}
		int avg = (a+b)/2;
		System.out.println("The Average is ");
		return avg;
	}
	
	static int minimum(int a, int b) {
		return (a<b)?a:b; 
	
	

}
}
