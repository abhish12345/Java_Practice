package Practice;
import java.util.Scanner;

public class practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String Name = sc.nextLine();
		System.out.println("Enter your Enrollment: ");
		int Enroll =  sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Favourite Subject: ");
		String Subject = sc.nextLine();
		College c1 = new College();
		c1.Name = Name;
		c1.Enroll = Enroll;
		c1.Subject = Subject;
		c1.value();

	}

}

class College {
	String Name;
	int Enroll;
	String Subject;
	
	public void value() {
		Name = this.Name;
		Enroll = this.Enroll;
		Subject = this.Subject;
		System.out.println("My name is "+Name+ " and Enrollment no is "+Enroll + " and Favorite Subject is "+Subject);
	}
}
