package JavaOOP.Lesson11.concurrentBegin.concurrent.creating;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_ThreadCreation {
    public static void main(String[] args) {
        Thread thread = new HelloThread();
        thread.start();

        System.out.println("Main is finished...");
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
        System.out.println("HelloTask is finished...");
    }
}
