package computers;

public class Main {
    public static void main(String[] args) {
        Computer ulComputer1 = new Ultrabook();
        Computer lapComputer1 = new Laptop();
        Computer persComputer1 = new PersonalComputer();
        Computer workStatComputer1 = new WorkingStation();

        System.out.println(workStatComputer1);
        System.out.println(persComputer1);
        System.out.println(ulComputer1);
        System.out.println(lapComputer1);

    }
}
