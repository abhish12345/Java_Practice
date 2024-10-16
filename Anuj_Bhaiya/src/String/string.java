package String;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anuj";
		String sameName = "anuj";
		String newName = new String("Anuj kumar");
		String viewName = new String("Anuj kumar");
//		
//		System.out.println(name);
//		System.out.println(newName);
//		
//		System.out.println("Anuj Kumar");
		
//		if(name == sameName) {
//			System.out.println("Both are same");
//		}
		
//		if(newName == viewName) {
//			System.out.println("Both are same");
//		}else {
//			System.out.println("Not same");
//		}
//		
//		if(viewName == sameName) {
//			System.out.println("Both are same");
//		} else{
//			System.out.println("Both are not same");
//		}
		
		if(name.equals(sameName)) {
			System.out.println("name and newName has same value");
		}else {
			System.out.println("Not same");
		}

	}

}
