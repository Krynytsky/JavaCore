package ContactsLambda;

public interface Dao {
    static void create(int id);
    static void delete(int id);
   default void read(int id);
    static void update(int id);
}
