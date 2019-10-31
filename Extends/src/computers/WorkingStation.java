package computers;

public class WorkingStation extends  Computer {

    private String memory;

    public WorkingStation() {
    }

    public WorkingStation(int id, String ram, String memory) {
        super(id, ram);
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "WorkingStation{" +
                "memory='" + memory + '\'' +
                "} " + super.toString();
    }
}
