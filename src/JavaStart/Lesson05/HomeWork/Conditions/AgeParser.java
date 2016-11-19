package JavaStart.Lesson05.HomeWork.Conditions;

import java.util.Scanner;

/**
 * Created by Anatoliy on 18.09.2016.
 */
/*
������� ������ �������� (� ������ ������������ ����� ���� int). �����
 ������������ ������������ ���������. ���� ������� ������ �������� ������, ��� ��
 ������������� ��������� 1..120, ������� ���������� IllegalArgumentException.
 */
public class AgeParser {

    public static void main(String[] args) {

        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age = ");
        String ageString = in.nextLine();
        int parseAge = Integer.parseInt(ageString);
        in.close();

        // Input validation
        if (parseAge <= 0 || parseAge > 120) {
            throw new IllegalArgumentException();
        }

        // Output
        System.out.println(parseAge);
    }
}
