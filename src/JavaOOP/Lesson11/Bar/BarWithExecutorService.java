package JavaOOP.Lesson11.Bar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public class BarWithExecutorService {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int drinkerId = 0; drinkerId < 10; drinkerId++) {
            executor.submit(new Drinker());
        }
        executor.shutdown();

        ThreadUtils.println("Bar is closing");
    }
}
