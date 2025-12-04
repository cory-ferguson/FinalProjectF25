import java.util.*;

public class Cat extends Pet {
        Scanner input = new Scanner(System.in);

        public Cat(){
		this.petName = "Cat";
		System.out.println(petName + " Stats: "); 
		printStats();
        }//end constructor

        public static void main(String[] args){
                new Cat();
        }//end main

}//end class def
