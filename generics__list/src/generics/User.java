package generics;

public class User < ID, Name > {
    private ID id;
    private Name name;

    public User() {
    }

    public User(ID id, Name name) {
        this.id = id;
        this.name = name;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public <X> void foo (X x){
        System.out.println("hello");

    }
}
