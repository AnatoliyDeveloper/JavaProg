package JavaOOP.Lesson12.factorial;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class FactorialRunner {

    public static void main(String[] args) {
        Thread thread = new Thread(new FactorialTask(1_000_000));
        thread.start();

        ThreadUtils.sleep(TimeUnit.SECONDS.toMillis(2));

        thread.interrupt();

        ThreadUtils.println("Main is finished");
    }
}
