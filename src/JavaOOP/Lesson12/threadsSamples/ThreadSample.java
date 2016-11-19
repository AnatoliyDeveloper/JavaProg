package JavaOOP.Lesson12.threadsSamples;

import JavaOOP.Lesson12.factorial.ThreadUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class ThreadSample {

    public static void main(String[] args) {
        Thread thread = new Thread(new CountTask());
        thread.start();

        ThreadUtils.sleep(TimeUnit.SECONDS.toMillis(3));

        ThreadUtils.println("Main is finished");
    }
}

class CountTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            ThreadUtils.println(i);
            ThreadUtils.sleep(TimeUnit.SECONDS.toMillis(1));
        }
    }
}
