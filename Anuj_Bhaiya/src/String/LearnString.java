package String;

import java.util.Scanner;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name = "AbHiShek";
//		String names = "   Abhishek    ";
//		System.out.println(name.toUpperCase());
//		System.out.println(name.toLowerCase());
//		System.out.println(names.trim());
//		System.out.println("Carpet".startsWith("Car"));
//		System.out.println("Carpet".endsWith("Pet"));
//		System.out.println("Carpet".equals("carpet"));
//		System.out.println("Carpet".charAt(3));
//		char temp = "Carpet".charAt(3);
//		System.out.println(temp);
		
		
		
//		int age = 123;
//		String stringAge = String.valueOf(age);
//		System.out.println(age+2); //125
//		System.out.println(stringAge+2); //1232
		
		
//		String sentence = "I love Java, Java is a good language";
////		String newSentence = sentence.replace("Java", "Python");
//		
//		String Substring = sentence.substring(2,5);
//		System.out.println(Substring);
//		
//		
//		
//		String words[]=sentence.split(",");
//		for (String word : words) {
//			System.out.println(word);
//		}
		
//		System.out.println(sentence);
//		System.out.println(newSentence);
//		
//		System.out.println(sentence.contains("Python"));

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your First Name: ");
//		String firstName = sc.nextLine();
//		
//		System.out.println("Enter your Last Name");
//		String LastName = sc.nextLine();
//		
//		System.out.println("Your Full Name is "+firstName+ " " +LastName);
//		System.out.println(firstName + LastName);
		
		String color = "Brown is my fav color!";
		char letters[] = color.toCharArray();
		
		for (char c : letters) {
			System.out.println(c);
		}
		
		String animal = " ";
		if(animal.isEmpty()) {
			System.out.println("empty");
		}else if(animal.isBlank()) {
			System.out.println("Blank");
		}
		
	}

}
