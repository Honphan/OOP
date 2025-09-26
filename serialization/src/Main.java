import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Dog", 10);
//        try {
//            FileOutputStream fileStream = new FileOutputStream("test.txt");
//            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
//            objectStream.writeObject(animal);
//            objectStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try{
            FileInputStream fileStream = new FileInputStream("test.txt");
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            Object obj = objectStream.readObject();
            Animal a = (Animal) obj;
            System.out.println(a.name);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}