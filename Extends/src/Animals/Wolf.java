package Animals;

public class Wolf extends WildAnimal {
    private String name;

    public Wolf() {
    }

    public Wolf(int id, String livingEnvirontment, String name) {
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
        return "Wolf{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("Hello, wolfy");
    }

    public void scream(){
        System.out.println("say AUUUU");

    }
}
