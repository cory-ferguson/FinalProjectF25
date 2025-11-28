Game.class: Game.java Dog.class Cat.class
	javac -g Game.java

Event.class: Event.java
	javac -g Event.java

Dog.class: Dog.java Pet.class
	javac -g Dog.java

Cat.class: Cat.java Pet.class
	javac -g Cat.java

Pet.class: Pet.java
	javac -g Pet.java


run: Game.class
	java Game

testEvent: Event.class
	java Event

testDog: Dog.class
	java Dog

testCat: Cat.class
	java Cat

clean: 
	rm *.class

debug: 
	jdb Game
