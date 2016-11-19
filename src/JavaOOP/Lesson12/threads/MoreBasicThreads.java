package JavaOOP.Lesson12.threads;

/**
 * Created by Anatoliy on 17.11.2016.
 */
public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
    }
}
