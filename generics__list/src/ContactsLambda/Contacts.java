package ContactsLambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contacts implements Dao {
    private int id;
    private String name;
    private Company company;
    private String email;
    private String phone;
    private Department department;

    @Override
    public void read(int id) {
        System.out.println(contacts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacts)) return false;
        Contacts contacts = (Contacts) o;
        return getId() == contacts.getId() &&
                Objects.equals(getName(), contacts.getName()) &&
                getCompany() == contacts.getCompany() &&
                Objects.equals(getEmail(), contacts.getEmail()) &&
                Objects.equals(getPhone(), contacts.getPhone()) &&
                getDepartment() == contacts.getDepartment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCompany(), getEmail(), getPhone(), getDepartment());
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company=" + company +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", department=" + department +
                '}';
    }


}

