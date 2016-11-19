package JavaOOP.Lesson11.concurrentBegin.concurrent.creating;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_CurrentThreadSample {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("main(): " + currentThread.getName());

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println("run(): " + Thread.currentThread().getName());
            }, "Hello " + i).start();
        }
    }
}
