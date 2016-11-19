package JavaOOP.Lesson11.HomeWork;

import java.math.BigInteger;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class Factorial {

    public static BigInteger calculateFactorial(int value) {

        BigInteger factorial = BigInteger.ONE;

        if (value >= 1) {
            for (int i = 1; i <= value; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else if (value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(-1);
        }
    }
}
