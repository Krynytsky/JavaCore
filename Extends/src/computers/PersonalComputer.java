package computers;

public class PersonalComputer extends Computer {

    private double screenSize;

    public PersonalComputer() {
    }

    public PersonalComputer(int id, String ram, double screenSize) {
        super(id, ram);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "screenSize=" + screenSize +
                "} " + super.toString();
    }
}