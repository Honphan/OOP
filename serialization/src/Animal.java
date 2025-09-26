import java.io.Serializable;

public class Animal implements Serializable {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
