package Animals;

public class Dog extends Pet {
    private String colour;
    private int age;

    public Dog() {
    }

    public Dog(int id, String livingEnvirontment, String colour, int age) {
        super(id, livingEnvirontment);
        this.colour = colour;
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
