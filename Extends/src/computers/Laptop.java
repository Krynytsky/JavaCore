package computers;

public class Laptop extends Computer {
    private double width;
    private double heigth;

    public Laptop() {
    }

    public Laptop(int id, String ram, double width, double heigth) {
        super(id, ram);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "width=" + width +
                ", heigth=" + heigth +
                "} " + super.toString();
    }
}
