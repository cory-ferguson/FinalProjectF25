import java.util.*;

public class Game {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	private int alivePets = 2;
	private int turns = 0;
	private Dog dog = new Dog();
	private Cat cat = new Cat();

	public Game(){
		start();
	}//end constructor

	public static void main(String[] args){
		new Game();
	}//end main

	public void start(){
		//dog.rollEvent();
		boolean keepGoing = true;
		while(keepGoing) {
			turns++;
			//checks for 0 health
			if (cat.health <= 0 && dog.health <= 0){
				alivePets = 0;
			} else if (cat.health <= 0 && dog.health >= 1){
				alivePets = 1;
			} else if (cat.health >= 1 && dog.health <= 0){
				alivePets = 1;
			} else {
				alivePets = 2;
			}//end if
	
			//rolls an event every 2 turns 

			int randEvent = rand.nextInt(2) + 1;

			if (randEvent == 1){
				//Checks to see if it affects dog or cat
				//Event doesn't play if cat or dog has passed
				int randNumber = rand.nextInt(2) + 1;

				if (randNumber == 1 && dog.health > 0){
					System.out.println("Dog event: ");
					dog.rollEvent();
					System.out.println("New Dog Stats: ");
                                        dog.printStats();

				} else if (randNumber == 2 && cat.health > 0) {
					System.out.println("Cat event: ");
					cat.rollEvent();
					System.out.println("New Cat Stats: ");
					cat.printStats();
				}//end if
			}//end if

			if (alivePets == 0){
				System.out.println("Game Over.");
				keepGoing = false;
			} else {

				String response = menu();
				if (response.equals("0")){
					System.out.println("Response was 0"); //testing purposes
					
					//Handles dog stats
					dog.changeEnergyPos(dog.energy, 1); //increases energy
					dog.changeHunger(dog.hunger, 1);
					dog.changeBoredom(dog.boredom, 1);
					dog.changeHealth();
					System.out.println("New Dog Stats: ");
					dog.printStats();
					
					//Handles cat stats
					cat.changeEnergyPos(cat.energy, 1); //increases energy
					cat.changeHunger(cat.hunger, 1);
					cat.changeBoredom(cat.boredom, 1);
					cat.changeHealth();
					System.out.println("New Cat Stats: ");
					cat.printStats();

				} else if (response.equals("1")){
					System.out.println("Response was 1");
					System.out.println("0) Dog? or");
					System.out.println("1) Cat?");
					String secondResponse = input.nextLine();
					if (secondResponse.equals("0")) {
						//If user chose dog
						System.out.println("Chose dog."); //testing purposes
						//Handles dog stats
                                        	dog.changeEnergy(dog.energy, 1);
                                        	dog.changeHungerPos(dog.hunger, 1); //feeding dog
                                        	dog.changeBoredomPos(dog.boredom, 1); //increases since you're interacting with dog
                                        	dog.changeHealth();
                                        	System.out.println("New Dog Stats: ");
                                        	dog.printStats();

                                        	//Handles cat stats
                                        	cat.changeEnergy(cat.energy, 1);
                                        	cat.changeHunger(cat.hunger, 1);
                                        	cat.changeBoredom(cat.boredom, 1);
                                        	cat.changeHealth();
                                        	System.out.println("New Cat Stats: ");
                                        	cat.printStats();

					} else if (secondResponse.equals("1")) {
						//If user chose cat
						System.out.println("Chose cat."); //testing purposes
                                                //Handles dog stats
                                                dog.changeEnergy(dog.energy, 1);
                                                dog.changeHunger(dog.hunger, 1); 
                                                dog.changeBoredom(dog.boredom, 1);
                                                dog.changeHealth();
                                                System.out.println("New Dog Stats: ");
                                                dog.printStats();

                                                //Handles cat stats
                                                cat.changeEnergy(cat.energy, 1);
                                                cat.changeHungerPos(cat.hunger, 1); //feeding cat
                                                cat.changeBoredomPos(cat.boredom, 1); //increases since you're interacting with cat
                                                cat.changeHealth();
                                                System.out.println("New Cat Stats: ");
                                                cat.printStats();
					} else {
						System.out.println("Invalid input");
					}//end if

				} else if (response.equals("2")){
					System.out.println("Response was 2");
					System.out.println("0) Dog? or");
                                        System.out.println("1) Cat?");
                                        String secondResponse = input.nextLine();
                                        if (secondResponse.equals("0")) {
                                                //If user chose dog
                                                System.out.println("Chose dog."); //testing purposes
                                                //Handles dog stats
                                                dog.changeEnergy(dog.energy, 1);
                                                dog.changeHunger(dog.hunger, 1);
                                                dog.changeBoredomPos(dog.boredom, 1); //playing with dog
                                                dog.changeHealth();
                                                System.out.println("New Dog Stats: ");
                                                dog.printStats();

                                                //Handles cat stats
                                                cat.changeEnergy(cat.energy, 1);
                                                cat.changeHunger(cat.hunger, 1);
                                                cat.changeBoredom(cat.boredom, 1);
                                                cat.changeHealth();
                                                System.out.println("New Cat Stats: ");
                                                cat.printStats();

                                        } else if (secondResponse.equals("1")) {
                                                //If user chose cat
                                                System.out.println("Chose cat."); //testing purposes
                                                //Handles dog stats
                                                dog.changeEnergy(dog.energy, 1);
                                                dog.changeHunger(dog.hunger, 1);
                                                dog.changeBoredom(dog.boredom, 1);
                                                dog.changeHealth();
                                                System.out.println("New Dog Stats: ");
                                                dog.printStats();

                                                //Handles cat stats
                                                cat.changeEnergy(cat.energy, 1);
                                                cat.changeHunger(cat.hunger, 1); 
                                                cat.changeBoredomPos(cat.boredom, 1); //playing with cat
                                                cat.changeHealth();
                                                System.out.println("New Cat Stats: ");
                                                cat.printStats();
                                        } else {
                                                System.out.println("Invalid input");
                                        }//end if

				} else if (response.equals("3")) {
					keepGoing = false;
				} else {
					turns--;
					System.out.println("Invalid input.");
				}//end if
			}//end if
		}//end while
	}//end start


	public String menu(){
		System.out.println("0) Do nothing");
		System.out.println("1) Feed pet");
		System.out.println("2) Play with pet");
		System.out.println("3) Quit");
		String response = input.nextLine();
		return response;
	}//end menu
}//end class def
