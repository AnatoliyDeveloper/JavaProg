package JavaOOP.Lesson1;

import java.util.Arrays;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class ArrayStoring {

    public static void main(String[] args) {
        int[] a = {10};
        int[] b = a;

        b[0] = 1000;

        System.out.println("a = " + Arrays.toString(a));
    }
}
