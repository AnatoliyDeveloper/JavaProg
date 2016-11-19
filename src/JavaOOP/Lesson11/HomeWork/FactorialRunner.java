package JavaOOP.Lesson11.HomeWork;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class FactorialRunner {
    public static void main(String[] args) {

        int n = 100;
        int k = 1000;

        singleThread(n, k);
        multiThread(n, k);

        BigInteger factorial = Factorial.calculateFactorial(10);
        System.out.println(factorial);

        FactorialOutput factorialOutput = new FactorialOutput(100);
        factorialOutput.outputFactorial(factorial);
    }

    private static void multiThread(int n, int k) {
        long start = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= 0; i++){
            FactorialUtils factorialUtils = new FactorialUtils(i,k);
            Thread thread = new Thread(factorialUtils);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Multi threaded takes " + (stop - start) + " milliseconds");
    }

    private static void singleThread(int n, int k) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            FactorialUtils factorialUtils = new FactorialUtils(i, k);
            factorialUtils.run();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Single threaded takes " + (stop - start) + " milliseconds");
    }
}
