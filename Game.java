import java.util.*;

public class Game {
	Scanner input = new Scanner(System.in);
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
	
			//rolls an event every 2 turns 
			if (turns % 2 == 0){
				dog.rollEvent();
			}//end if

			if (alivePets == 0){
				System.out.println("Game Over.");
				keepGoing = false;
			} else {

				String response = menu();
				if (response.equals("0")){
					System.out.println("Response was 0");
					
					//Handles dog
					dog.changeEnergy(dog.energy, 1);
					dog.changeHunger(dog.hunger, 1);
					dog.changeBoredom(dog.boredom, 1);
					dog.changeHealth();
					System.out.println("New Dog Stats: ");
					dog.printStats();
					
					//Handles cat
					cat.changeEnergy(cat.energy, 1);
					cat.changeHunger(cat.hunger, 1);
					cat.changeBoredom(cat.boredom, 1);
					cat.changeHealth();
					System.out.println("New Cat Stats: ");
					cat.printStats();

				} else if (response.equals("1")){
					System.out.println("Response was 1");
				} else if (response.equals("2")){
					System.out.println("Response was 2");
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
