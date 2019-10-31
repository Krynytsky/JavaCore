package PracticeLambda;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Computer {
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
                Double.compare(computer.getPrice(), getPrice()) == 0 &&
                getModel().equals(computer.getModel()) &&
                getProcessor().equals(computer.getProcessor()) &&
                getHardDrive().equals(computer.getHardDrive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getYear(), getMemory(), getPrice(), getProcessor(), getHardDrive());
    }
}
