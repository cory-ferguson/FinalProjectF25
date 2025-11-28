import java.util.*;

public class Event {
        protected ArrayList<String> events = new ArrayList<String>();

        public Event(){
                events.add("Event 1");
                events.add("Event 2");
                events.add("Event 3");
		
		/*
                for (int i = 0; i < events.size(); i++){
                        System.out.println(events.get(i));
                }//end for
		*/

        }//end constructor
	
	/*
        public static void main(String[] args){
                new Event();
        }//end main
	*/

	public void eventRoll(){
	//gets a random event and prints it
		Random rand = new Random();
		int randomIndex = rand.nextInt(events.size());
		String randomEvent = events.get(randomIndex);
		System.out.println("Random Event: " + randomEvent);
	}//end eventRoll


}//end class def
