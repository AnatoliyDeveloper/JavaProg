package JavaOOP.Lesson11.HomeWork;

import java.math.BigInteger;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class FactorialUtils implements Runnable {

    private final int i;
    private final int k;

    public FactorialUtils(int i, int k) {
        this.i = i;
        this.k = k;
    }

    @Override
    public void run() {
        Factorial factorial = new Factorial();
        BigInteger calculateFactorial = factorial.calculateFactorial(i * k);

        FactorialOutput factorialOutput = new FactorialOutput(i * k);
        factorialOutput.outputFactorial(calculateFactorial);
    }
}
