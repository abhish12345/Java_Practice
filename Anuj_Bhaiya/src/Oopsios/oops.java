package Oopsios;

class Pen {
	String color;
	String type; // ballpoint, gel
	
	public void write(String color,String type) {
		System.out.println("writing something by "+color + " color Pen which type is "+ type);
	}
	
	public void printColor() {
		//color=this.color;
		//type=this.type;
		System.out.println(this.color);
	}
}


class Student {
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
//	Student(String name,int age){
//		//System.out.println("constructor called");
//		this.name = name;
//		this.age = age; 
//	}
	
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	Student() {
		
	}
}

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pen p1 = new Pen();
//		p1.color = "blue";
//		p1.type = "gel";
//		p1.write(p1.color,p1.type);
//		
//		Pen p2 = new Pen();
//		p2.color ="black";
//		p2.type= "ballpoint";
//		
//		p1.printColor();
//		p2.printColor();
		
		Student s1 = new Student();
		s1.name = "Abhishek";
		s1.age = 24;
		
		Student s2 = new Student(s1);
		s2.printInfo();
		
		
//		Abhishek a1 = new Abhishek();
//		a1.printplay();
//		System.out.println(this.paly);
		
		//Abhishek.LastName = "Pandey";
		//System.out.print(Abhishek.LastName);
		//Abhishek.Enrollment = 05;
		//Abhishek.prints();
		
	}

}

//class Abhishek{
//	String LastName;
//	int Enrollment;
//		
//	}
//	
//	public void prints() {
//		LastName = this.LastName;
//		Enrollment = this.Enrollment;
//		//System.out.println(this.Enrollment);
//		//System.out.println(LastName);
//		//System.out.println();
//	}
//}
