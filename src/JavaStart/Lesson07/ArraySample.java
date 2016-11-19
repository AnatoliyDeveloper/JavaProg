package JavaStart.Lesson07;

import java.util.Arrays;

/**
 * Created by Anatoliy on 23.09.2016.
 */
public class ArraySample {

    public static void main(String[] args) {
        int[] array = {-1, 0, -5, 6, 8};

        System.out.println("firstPositiveElem: " + findFistPositiveElem(array));
        System.out.println("firstPositiveElemIndex: " + findFirstPositiveElemIndex(array));
        System.out.println("positivesSum: " + positivesSum(array));
        System.out.println("min: " + min(array));
        System.out.println("sum: " + sum(array));

        reverse(array);
        System.out.println("reversed: " + Arrays.toString(array));

        seqFill(array);
        System.out.println("seqFilled: " + Arrays.toString(array));

        reverseSeqFill(array);
        System.out.println("reverseSeqFilled: " + Arrays.toString(array));
    }
    // ���� ������������� ��������� �������
    public static int positivesSum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            if (elem <= 0) {
                continue;
            }

            sum += elem;
        }
        return sum;
    }
    // ����� ������� �������������� �������� �������
    public static int findFistPositiveElem(int[] array) {
        for (int elem : array) {
            if (elem > 0) {
                return elem;
            }
        }
        return -1;
    }
    // ����� ������� ������� �������������� �������� �������
    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }
    // ���������� ������������ �������� �������
    public static int min(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int min = array[0];
        for (int elem : array) {
            min = Math.min(min, elem);
        }
        return min;
    }
    // ������������ ���� ��������� �������
    private static int sumWithoutForeach(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }
        return sum;
    }
    // ������������ ���� ��������� ������� Foreach
    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
    // ��������� �������
    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j);
        }
    }
    // ����� ����� 2-� ��������� �������
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // ���������� ������� � �������� ������� �� filler �� 0
    public static void reverseSeqFillV2(int[] array) {
        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler--;
        }
    }
    // ���������� ������� � �������� ������� �� filler �� 0 (������ ������� �������)
    public static void reverseSeqFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int filler = array.length - i - 1;
            array[i] = filler;
        }
    }
    // ���������� ������� � ������ ������� �� 0 �� i
    public static void seqFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
