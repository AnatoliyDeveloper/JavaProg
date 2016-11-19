package JavaOOP.Lesson12.factorial;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public final class ThreadUtils {

    private ThreadUtils() {}

    public static void println(Object msg) {
        Thread thread = Thread.currentThread();
        System.out.println(thread + ": " + msg);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
