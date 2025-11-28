import java.util.*;

public class Pet {
	protected String petName;
	protected Event event = new Event();  
	
	public int health = 100;
	public int energy = 3;
	public int hunger = 3;
	public int boredom = 3;

	public int changeHealth(){
		if (energy <= 1 || hunger <= 1 || boredom <= 1) {
			int newHealth = health - 5;
			setHealth(newHealth);
			return newHealth;
		} else {
			return health;
		}//end if

	}//end changeHealth
	
	public String printStats(){
		System.out.println("Health: " + health + "/100");
		System.out.println("Energy: " + energy + "/3");
		System.out.println("Hunger: " + hunger + "/3");
		System.out.println("Boredom: " + boredom + "/3");
		System.out.println("");
		return ""; 
	}//end printStats
	
	public void rollEvent(){
		event.eventRoll();
	}//end rollEvent

	public void changeEnergy(int energy, int number){
		int newEnergy = energy - number;
		setEnergy(newEnergy);

		//makes sure stat cannot go under 0
		if (energy <= 0){
			newEnergy = 0;
			setEnergy(newEnergy);
		}//end if
	}//end changeEnergy
	
	public void changeHunger(int hunger, int number){
		int newHunger = hunger - number;	
		setHunger(newHunger);

		//makes sure stat cannot go under 0
                if (hunger <= 0){
                        newHunger = 0;
                        setHunger(newHunger);
                }//end if
	}//end changeHunger
	
	public void changeBoredom(int boredom, int number){
		int newBoredom = boredom - number;
		setBoredom(newBoredom);

		//makes sure stat cannot go under 0
		if (boredom <= 0){
			newBoredom = 0;
			setBoredom(newBoredom);
		}//end if
	}//end changeBoredom
	



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
