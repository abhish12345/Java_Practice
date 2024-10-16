package LearnPolymorphism;
import java.util.ArrayList;
import java.util.*;

class Data {
	int data;
	
	
	public void printData() {
		System.out.println(data);
	}
	
	public void printData(int times) {
		for(int i = 0; i<times; i++) {
			System.out.println(data);
		}
	}
}


class ChildData extends Data{
//	@Override
//	public void printData() {
//		System.out.println("overridden "+data);
//	}
	public void insideChildOnly() {
		
	}
}

public class LearnPolymorphism {

	public static void main(String[] args) {
		
		Object obj = new ChildData();
		
		
		List<Integer> l1 = new ArrayList<>();
		Queue<Integer> l2 = new LinkedList<>();

		 

	// TODO Auto-generated method stub
		Data d;
		
		d = new ChildData();
		
		
		d.printData(); //runtime polymorphism aka method overriding 
		
		Data d2 = new Data();
		d2.printData(5); //compile time polymorphism aka mehtod overloading
		
//		Integer a = 5;
//		Data obj = new Data();
//		obj.data =5;
//		System.out.println(obj.data);
//		changeValue(a,obj);
//		System.out.println(a);
//		System.out.println(obj.data);
		

	}
	
	static void changeValue(int a,Data obj) {
		a=5;
		obj.data = 100;
	}

}
