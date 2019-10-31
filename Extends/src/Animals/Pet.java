package Animals;

public class Pet extends Animal {
    private String livingEnvirontment;

    public Pet() {
    }

    public Pet(int id, String livingEnvirontment) {
        super(id);
        this.livingEnvirontment = livingEnvirontment;
    }

    public String getLivingEnvirontment() {
        return livingEnvirontment;
    }

    public void setLivingEnvirontment(String livingEnvirontment) {
        this.livingEnvirontment = livingEnvirontment;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "livingEnvirontment='" + livingEnvirontment + '\'' +
                "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("hello, you are a pet animal");
    }
}
