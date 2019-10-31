package Animals;

public class Animal {
    private int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }

    public void greeting(){
        System.out.println("hello");
    };
}
