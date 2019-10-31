package PracticeLambda;

import java.util.Objects;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class HardDrive {
    private String hardDriveModel;
    private Type hardDriveType;
    private int hardDriveVolume;
    private Country countryMamufacture;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HardDrive)) return false;
        HardDrive hardDrive = (HardDrive) o;
        return getHardDriveVolume() == hardDrive.getHardDriveVolume() &&
                getHardDriveModel().equals(hardDrive.getHardDriveModel()) &&
                getHardDriveType() == hardDrive.getHardDriveType() &&
                getCountryMamufacture() == hardDrive.getCountryMamufacture();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHardDriveModel(), getHardDriveType(), getHardDriveVolume(), getCountryMamufacture());
    }
}
