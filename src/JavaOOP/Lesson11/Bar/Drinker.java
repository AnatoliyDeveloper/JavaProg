package JavaOOP.Lesson11.Bar;

import static JavaOOP.Lesson11.Bar.ThreadUtils.println;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        for (int beer = 0; beer < 10; beer++) {
            println("I'm " + id + " drinker. " +
                    "I'm drinking " + beer + " beer");
        }
    }
}
