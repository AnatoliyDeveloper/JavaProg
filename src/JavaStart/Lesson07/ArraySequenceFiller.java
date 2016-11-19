package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */

import java.util.Arrays;

/**
 * ���������������� ���������� �������� �������.
 *
 * @author bvanchuhov
 */
public class ArraySequenceFiller {

    public static void main(String[] args) {
        int[] array = new int[10];
        sequenceFill(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * ��������������� ��������� ������ ������� �� 0 �� {@code length}-1.<br/>
     * ������: ������ �� 5 �������� ������ ���� �������� {0, 1, 2, 3, 4}.
     *
     * @param array �������� ������.
     * @throws IllegalArgumentException ���� ������ {@code null}.
     */
    public static void sequenceFill(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
