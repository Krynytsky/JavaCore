package Animals;

public class Fox extends WildAnimal {
    private String name;

    public Fox() {
    }

    public Fox(int id, String livingEnvirontment, String name) {
        super(id, livingEnvirontment);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
