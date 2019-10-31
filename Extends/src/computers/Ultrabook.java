package computers;

public class Ultrabook extends Laptop {

    private double thickness;

    public Ultrabook() {
    }

    public Ultrabook(int id, String ram, double width, double heigth, double thickness) {
        super(id, ram, width, heigth);
        this.thickness = thickness;
    }

    public Ultrabook(int id, String ram, double width, double heigth) {
        super(id, ram, width, heigth);
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
