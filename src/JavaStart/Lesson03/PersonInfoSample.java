package JavaStart.Lesson03;
import java.util.Scanner;

/**
 * Created by Anatoliy on 10.09.2016.
 */
public class PersonInfoSample {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in); // �������� scanner

        System.out.print("Enter name: ");
        String name = scanner.next(); // ������ ������

        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // ������ int

        // Business Logic
        String personInfo = "Hello, I'm " + name + ", " + age + " years old";

        // Output
        System.out.println(personInfo);
    }

}
