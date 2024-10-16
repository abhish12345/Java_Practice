package oops_3LearnPackage;


public class Teacher {
	
	public int teachingClass;
	
	private int id;
	
	String degree; // default or package-private
	
	protected int StudentCount;
	
	
	public static void main(String  [] args) {
		Teacher obj = new Teacher();
		obj.teachingClass = 12;
		obj.id = 123;
	}

}
