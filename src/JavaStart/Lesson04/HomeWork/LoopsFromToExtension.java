package JavaStart.Lesson04.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 18.09.2016.
 */
public class LoopsFromToExtension {

    public static void main(String[] args) {

        //������� ��� ����� �� from �� to. from, to - �����.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter from = ");
        int from = in.nextInt();

        System.out.print("Enter to = ");
        int to = in.nextInt();

        in.close();

        if (from <= to) {
            for (int i = from; i <= to; i++)
            {
                System.out.print(i + " ");
            }

            System.out.println(" ");
        }
        else if (from > to){
            for (int i = from; i >= to; i--)
            {
                System.out.print(i + " ");
            }

            System.out.println(" ");
        }
    }
}
