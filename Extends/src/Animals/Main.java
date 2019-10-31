package Animals;

public class Main {

    public static void main(String[] args) {
	Dog puppy = new Dog(1, "home", "black", 15);
	puppy.setColour("white");
	Wolf wolf = new Wolf(1, "forest","sirko");
    Wolf wolf1 = new Wolf();
    wolf1.setName("chornuj");
    wolf1.greeting();
    wolf1.scream();
    Fox foxy = new Fox();
    foxy.greeting();
    puppy.greeting();
    Animal animal = new Animal();
    animal.greeting();
    }
}
