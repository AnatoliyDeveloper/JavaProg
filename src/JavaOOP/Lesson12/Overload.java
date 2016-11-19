package JavaOOP.Lesson12;

/**
 * Created by Anatoliy on 12.11.2016.
 */
public class Overload{
    public void method(Object o) {
        System.out.println("Object");
    }
    public void method(java.io.FileNotFoundException f) {
        System.out.println("FileNotFoundException");
    }
    public void method(java.io.IOException i) {
        System.out.println("IOException");
    }
    public static void main(String args[]) {
        Overload test = new Overload();
        test.method(null);
    }
}
