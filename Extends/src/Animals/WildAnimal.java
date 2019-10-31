package Animals;

public class WildAnimal extends Animal {
    private String livingEnvirontment;

    public String getLivingEnvirontment() {
        return livingEnvirontment;
    }


    public void setLivingEnvirontment(String livingEnvirontment) {
        this.livingEnvirontment = livingEnvirontment;
    }

    public WildAnimal() {
    }

    public WildAnimal(int id, String livingEnvirontment) {
        super(id);
        this.livingEnvirontment = livingEnvirontment;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "livingEnvirontment='" + livingEnvirontment + '\'' +
                "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("hello,you are wild animal");
    }

}
