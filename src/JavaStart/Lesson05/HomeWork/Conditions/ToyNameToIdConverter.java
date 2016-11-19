package JavaStart.Lesson05.HomeWork.Conditions;

import java.util.Scanner;

/**
 * Created by Anatoliy on 18.09.2016.
 */
/*
����������� �������������� ������� ������� �� �� �������� (������, �������� �
Task 4). ���� ������ ������� ���, ������� ���������� IllegalArgumentException.
����������� � ������� switch-case.
0 � Car.

1 � Lego.

2 � Doll.

3 � Puzzle.
 */
public class ToyNameToIdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter name = ");
        String name = in.nextLine();
        in.close();

        int getToyId0 = 0;
        int getToyId1 = 1;
        int getToyId2 = 2;
        int getToyId3 = 3;

        switch (name) {
            case "Car":
                System.out.println(getToyId0);
                break;
            case "Lego":
                System.out.println(getToyId1);
                break;
            case "Doll":
                System.out.println(getToyId2);
                break;
            case "Puzzle":
                System.out.println(getToyId3);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
