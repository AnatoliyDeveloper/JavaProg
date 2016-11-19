package JavaOOP.Lesson11.Bar;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public class AnonymousRunnable {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("Hello");
            }
        }).start();

        ThreadUtils.println("Bye");
    }
}
