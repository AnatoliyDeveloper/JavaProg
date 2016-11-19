package JavaOOP.Lesson11.Bar;

import static JavaOOP.Lesson11.Bar.ThreadUtils.println;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public class Bar {

    public static void main(String[] args) {
        for (int drinker = 0; drinker < 10; drinker++) {
            new Thread(new Drinker()).start();
        }

        println("Bar is closing");
    }
}
