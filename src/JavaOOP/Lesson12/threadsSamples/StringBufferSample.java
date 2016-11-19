package JavaOOP.Lesson12.threadsSamples;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class StringBufferSample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Request());
        Thread thread2 = new Thread(new Request());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(ChatRoom.INSTANCE.getRoom());
    }
}

enum ChatRoom {
    INSTANCE;

    private StringBuffer room = new StringBuffer();

    public void send(String msg) {
        synchronized (room) {
            room.append(msg);
            room.append("\n");
        }
    }

    public String getRoom() {
        return room.toString();
    }
}

class Request implements Runnable {

    private static int nextId = 0;
    private int id = nextId++;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            ChatRoom.INSTANCE.send((id == 0) ? "Hello" : "Bye");
        }
    }
}
