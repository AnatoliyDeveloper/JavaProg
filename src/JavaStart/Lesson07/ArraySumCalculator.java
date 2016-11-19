package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/**
 * ������� ����� ��������� �������.
 *
 * @author bvanchuhov
 */
public class ArraySumCalculator {

    public static void main(String[] args) {
        int[] array = {30, -10, 20, 100};
        System.out.println("sum with foreach = " + sum(array));
        System.out.println("sum with iteration = " + sumWithIteration(array));
    }

    /**
     * ������������ ����� �������� �������.<br/>
     * <b>������� � ������������� for-each.</b>
     *
     * @param array �������� ������.
     * @return ����� ��������� �������.
     * @throws IllegalArgumentException ���� ������ {@code null}.
     */
    public static int sum(int[] array) {
        checkNotNull(array);

        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        return sum;
    }

    /**
     * ������������ ����� �������� �������.<br/>
     * <b>������� � ������������� ������� �������� (������������).</b>
     *
     * @param array �������� ������.
     * @return ����� ��������� �������.
     * @throws IllegalArgumentException ���� ������ {@code null}.
     */
    @Deprecated
    public static int sumWithIteration(int[] array) {
        checkNotNull(array);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }

        return sum;
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
