import java.util.*;

public class Pet {
	protected String petName;
	protected Event event = new Event();  
	
	public int health = 100;
	public int energy = 3;
	public int hunger = 3;
	public int boredom = 3;

	public void changeHealth(){
		if (energy <= 1 || hunger <= 1 || boredom <= 1) {
			int newHealth = health - 5;
			setHealth(newHealth);
			//return newHealth;
		}//end if 
		
		//Makes sure health cannot go below 0
		if (health <= 0) {
			int newHealth = 0;
			setHealth(newHealth);
		}//end if

	}//end changeHealth
	
	public String printStats(){
		//To not clutter the screen, stats won't print if pet is dead
		if (health > 0){
			System.out.println("Health: " + health + "/100");
			System.out.println("Energy: " + energy + "/3");
			System.out.println("Hunger: " + hunger + "/3");
			System.out.println("Boredom: " + boredom + "/3");
			System.out.println("");
			return "";
		} else {
			System.out.println(petName + " passed away...");
			return "";
		}//end if
	}//end printStats
	
	public void rollEvent(){
		String element = event.eventRoll();
		System.out.println(element);

		//This will check what event happened, and then change the stats based on the event

		if (element.equals(event.events.get(0))){
			changeBoredomPos(boredom, 2); //adds 2 to boredom
			changeHungerPos(hunger, 2); //adds 2 to hunger
			changeEnergy(energy, 1); //subtracts 1 from energy
		
		} else if (element.equals(event.events.get(1))){
			changeBoredomPos(boredom, 2); //adds 2 to boredom
			changeEnergyPos(energy, 2); //adds 2 to energy

		} else if (element.equals(event.events.get(2))){
			int newHealth = health - 10;
			setHealth(newHealth);
			if (health <= 0){
				newHealth = 0;
				setHealth(newHealth);
			}//end if

		} else if (element.equals(event.events.get(3))){
			changeHungerPos(hunger, 2); //adds 2 to hunger

		} else if (element.equals(event.events.get(4))){
			changeBoredomPos(boredom, 2); //adds 2 to boredom
			changeEnergy(energy, 1); //subtracts 1 from energy
		
		} else if (element.equals(event.events.get(5))){
			int newHealth = health + 25;
                        setHealth(newHealth);
                        if (health >= 100){
                                newHealth = 100;
                                setHealth(newHealth);
                        }//end if
		} else {
			System.out.println("how did you get here?");
		}//end if
                         
	}//end rollEvent

	//Subtracts the inputed number
	public void changeEnergy(int energy, int number){
		int newEnergy = energy - number;
		setEnergy(newEnergy);

		//makes sure stat cannot go under 0
		if (energy <= 0){
			newEnergy = 0;
			setEnergy(newEnergy);
		}//end if
	}//end changeEnergy
	
	//Adds the inputed number
	public void changeEnergyPos(int energy, int number){
		int newEnergy = energy + number;
		setEnergy(newEnergy); 

		//makes sure stat cannot go above 3
		if (energy >= 3){
			newEnergy = 3;
			setEnergy(newEnergy);
		}//end if
	}//end changeEnergyPos
	
	//Subtracts the inputed number
	public void changeHunger(int hunger, int number){
		int newHunger = hunger - number;	
		setHunger(newHunger);

		//makes sure stat cannot go under 0
                if (hunger <= 0){
                        newHunger = 0;
                        setHunger(newHunger);
                }//end if
	}//end changeHunger
	
	//Adds the inputed number
	public void changeHungerPos(int hunger, int number){
		int newHunger = hunger + number;
		setHunger(newHunger);

		//makes sure stat cannot go above 3
		if (hunger >= 3){
			newHunger = 3;
			setHunger(newHunger);
		}//end if
	}//end changeHungerPos
	
	//Subtracts the inputed number
	public void changeBoredom(int boredom, int number){
		int newBoredom = boredom - number;
		setBoredom(newBoredom);

		//makes sure stat cannot go under 0
		if (boredom <= 0){
			newBoredom = 0;
			setBoredom(newBoredom);
		}//end if
	}//end changeBoredom
	
	//Adds the inputed number
	public void changeBoredomPos(int boredom, int number){
		int newBoredom = boredom + number;
		setBoredom(newBoredom);

		//makes sure stat cannot go above 3
		if (boredom >= 3){
			newBoredom = 3;
			setBoredom(newBoredom);
		}//end if
	}//end changeBoredomPos


	public int getHealth(){
		return this.health;
	}//end getHealth
	
	public void setHealth(int health){
		this.health = health;
	}//end setHealth
	
	public int getEnergy(){
		return this.energy;
	}//end getEnergy
	
	public void setEnergy(int energy){
		this.energy = energy;
	}//end setEnergy
	
	public int getHunger(){
		return this.hunger;
	}//end getHunger()
	
	public void setHunger(int hunger){
		this.hunger = hunger;
	}//end setHunger
	
	public int getBoredom(){
		return this.boredom;
	}//end setBoredom
	
	public void setBoredom(int boredom){
		this.boredom = boredom;
	}//end setBoredom
	
	public String getPetName(){
		return this.petName;
	}//end getPetName
	
	public void setPetName(String petName){
		this.petName = petName;
	}//end setPetName

	
}//end class def
