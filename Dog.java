import java.util.*;

public class Dog extends Pet {
	Scanner input = new Scanner(System.in);

	public Dog(){
		/*
		System.out.print("New pet name: ");
		String response = input.nextLine();
		setPetName(response);
		*/
		this.petName = "Dog";
		//System.out.println("Hello, " + petName); //testing purposes
		System.out.println(petName + " Stats: ");
		printStats();
	}//end constructor
	
	public static void main(String[] args){
		new Dog();
	}//end main

}//end class def
