package computers;

public class Computer {
    private int id;
    private String ram;

    public Computer() {
    }

    public Computer(int id, String ram) {
        this.id = id;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", ram='" + ram + '\'' +
                '}';
    }
}
