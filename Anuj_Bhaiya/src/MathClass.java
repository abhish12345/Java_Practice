
public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 6;
		
		System.out.println(Math.min(a, b));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.abs(-8));
//		System.out.println(Math.random()*10);
		System.out.println(getRandom(10,45));
		System.out.println(Math.floor(5.9));
		System.out.println(Math.ceil(5.9));
		System.out.println(Math.round(5.8));
	}
	
	public static int getRandom(int a, int b) {
//		return (int)(Math.random()*6)+1;
		return (int)(Math.random()*(b-a+1)+a);
	}

}
