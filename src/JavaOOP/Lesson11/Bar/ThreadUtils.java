package JavaOOP.Lesson11.Bar;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public final class ThreadUtils {

    private ThreadUtils() {}

    public static void println(String msg) {
        Thread thread = Thread.currentThread();
        System.out.println(thread + ": " + msg);
    }
}
