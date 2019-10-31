package Animals;

public class Cat extends Pet {
    private String colour;
    private int age;

    public Cat() {
    }

    public Cat(int id, String livingEnvirontment, String colour, int age) {
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
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
