package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */

import java.util.Arrays;

/**
 * ���������������� ���������� �������� ������� � �������� �������.
 *
 * @author bvanchuhov
 */
public class ArrayReverseSequenceFiller {

    public static void main(String[] args) {
        testV1();
        testV2();
    }

    private static void testV1() {
        int[] array = new int[10];
        reverseSequenceFillV1(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testV2() {
        int[] array = new int[10];
        reverseSequenceFillV2(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * ��������������� ��������� ������ ������� �� {@code length}-1 �� 0 (�������� �������).<br/>
     * ������: ������ �� 5 �������� ������ ���� �������� {4, 3, 2, 1, 0}.<br/>
     * <b>������ 1.</b>
     *
     * @param array �������� ������.
     * @throws IllegalArgumentException ���� ������ {@code null}.
     */
    public static void reverseSequenceFillV1(int[] array) {
        checkNotNull(array);

        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler--;
        }
    }

    /**
     * ��������������� ��������� ������ ������� �� {@code length}-1 �� 0 (�������� �������).<br/>
     * ������: ������ �� 5 �������� ������ ���� �������� {4, 3, 2, 1, 0}.<br/>
     * <b>������ 2.</b>
     *
     * @param array �������� ������.
     * @throws IllegalArgumentException ���� ������ {@code null}.
     */
    public static void reverseSequenceFillV2(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i - 1;
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
