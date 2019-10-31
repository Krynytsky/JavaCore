package PracticeLambda;

import java.util.Objects;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Processor {
    private String processorType;
    private int coreQuntity;
    private double processorFrequency;
    private Country countryMamufacture;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Processor)) return false;
        Processor processor = (Processor) o;
        return getCoreQuntity() == processor.getCoreQuntity() &&
                Double.compare(processor.getProcessorFrequency(), getProcessorFrequency()) == 0 &&
                getProcessorType().equals(processor.getProcessorType()) &&
                getCountryMamufacture() == processor.getCountryMamufacture();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessorType(), getCoreQuntity(), getProcessorFrequency(), getCountryMamufacture());
    }
}
