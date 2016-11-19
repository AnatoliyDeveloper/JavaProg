package JavaOOP.Lesson12.threads;
//Простейший вариант использования класса Thread

/**
 * Created by Anatoliy on 17.11.2016.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
