package JavaOOP.Lesson12.threadsSamples;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class CounterSample {

    public static void main(String[] args) throws InterruptedException {
        CounterTask counterTask = new CounterTask();

        Thread thread1 = new Thread(counterTask);
        Thread thread2 = new Thread(counterTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counterTask.getCount());
    }
}

class CounterTask implements Runnable {

    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return count.get();
    }
}
