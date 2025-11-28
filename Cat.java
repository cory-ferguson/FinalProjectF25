import java.util.*;

public class Cat extends Pet {
        Scanner input = new Scanner(System.in);

        public Cat(){
		/*
                System.out.print("New pet name: ");
                String response = input.nextLine();
                setPetName(response);
		*/
		this.petName = "Cat";
                //System.out.println("Hello, " + petName); //testing purposes
		System.out.println(petName + " Stats: "); 
		printStats();
		
		/*
		int newEnergy = energy - 1;
		setEnergy(newEnergy);
		printStats();
		*/ 

        }//end constructor

        public static void main(String[] args){
                new Cat();
        }//end main

}//end class def
