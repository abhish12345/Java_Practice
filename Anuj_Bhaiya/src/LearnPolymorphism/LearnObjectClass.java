package LearnPolymorphism;

import java.util.Objects;

class Car {
	String model;
	int  year;
	
	public Car(String model,int year) {
		this.model =model;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Car{" +
				"model='" + model + '\'' +
				", year=" + year + '}';  
	}
	
	 
	
	@Override
	public boolean equals(Object o) {
		if (this==o) return true;
		if (o==null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return year == car.year && Objects.equals(model, car.model);	
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(model,year);
	}
	
	
//	@Override
//	public int hashCode() {
//		int initialNumber = 31;
//		initialNumber += year;
//		initialNumber += model.hashCode();
//		return initialNumber;
//	}
//	
	
//	public boolean equals(Object obj) {
//		Car that = (Car)obj;
//		if(this.model.equals(that.model)&&this.year==that.year) {
//			return true;
//		}
//		return false;	
//	}
//	
	
	
//	@Override
//	public String toString() {
//		return "Car ka  model "+ model+" and year is "+year;
//	}
}

public class LearnObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car("Honda",2022);
		Car obj2 = new Car("Honda",2021 );
		
		System.out.println(obj.equals(obj2));
		
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}

}
