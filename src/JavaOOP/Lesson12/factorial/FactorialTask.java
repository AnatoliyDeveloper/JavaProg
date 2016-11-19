package JavaOOP.Lesson12.factorial;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;


/**
 * Created by Anatoliy on 11.11.2016.
 *
 * n! = 1 * 2 * 3 * ... * n, n >= 0
 * 3! = 6
 * 0! = 1
 *
 */
public class FactorialTask implements Runnable {

    private int n;

    public FactorialTask(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }
        this.n = n;
    }

    @Override
    public void run() {
        try {
            TimeUnit.DAYS.sleep(1);
        } catch (InterruptedException e) {
            lastAction();
            return;
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));

            if (i % 100_000 == 0) {
                if (Thread.interrupted()) {
                    lastAction();
                    return;
                }
                ThreadUtils.println("Step " + i);
            }
        }
        ThreadUtils.println("res = " + res);
    }

    private void lastAction() {
        ThreadUtils.println("Hasta la vista");
    }
}
