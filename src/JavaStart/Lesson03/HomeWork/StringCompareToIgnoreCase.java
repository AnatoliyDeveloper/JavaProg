package JavaStart.Lesson03.HomeWork;

/**
 * Created by Anatoliy on 11.09.2016.
 */
public class StringCompareToIgnoreCase {

    public static void main(String[] args) {

        String s1 = "��� �������� 2 ������ �� ����������� ��� ����� �������� (�������� � ��������� ����� �� �����������)?";
        String s2 = "��� �������� 2 ������ �� ����������� ��� ����� �������� (�������� � ��������� ����� �� �����������)?";

        String s3 = "��� �������� 2 ������ �� ����������� ��� ����� �������� (�������� � ��������� ����� �� �����������)?";
        String s4 = "��� �������� 2 ������ �� ����������� ��� ����� �������� (�������� � ��������� ����� �� �����������)?";

        System.out.println("equalsIgnoreCase s1 and s2 = " + s1.equalsIgnoreCase(s2));
        System.out.println("equalsIgnoreCase s3 and s4 = " + s3.equalsIgnoreCase(s4));

    }

}
