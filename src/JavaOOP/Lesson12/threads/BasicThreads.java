package JavaOOP.Lesson12.threads;
//run LiftOff

/**
 * Created by Anatoliy on 17.11.2016.
 */
public class BasicThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
