package user;

public class User {
    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex=" + sex +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public char getSex() {
        return sex;
    }

    int id;
    String name;
    int age;
    double weight;
    char sex;


    public User() {
    }

    public User(int id, String name, int age, double weight, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }
}
