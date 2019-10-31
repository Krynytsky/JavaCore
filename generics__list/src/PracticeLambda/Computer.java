package PracticeLambda;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Computer{
    private String model;
    private int year;
    private int memory;
    private int price;
    private Processor processor;
    private HardDrive hardDrive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getYear() == computer.getYear() &&
                getMemory() == computer.getMemory() &&
                getPrice() == computer.getPrice() &&
                Objects.equals(getModel(), computer.getModel()) &&
                Objects.equals(getProcessor(), computer.getProcessor()) &&
                Objects.equals(getHardDrive(), computer.getHardDrive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getYear(), getMemory(), getPrice(), getProcessor(), getHardDrive());
    }

}
