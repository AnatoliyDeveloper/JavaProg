package Lessons;

/**
 * Created by Anatoliy on 30.08.2016.
 */
public class If_Else{

    public static void main(String[] args)
    {
        int a = 10, b = 100;

        if (a < b)
            System.out.println("a less b");
        else
            System.out.println("b less a");

        if (a < b)
        {
            System.out.println("� ������ �");
            System.out.println("� ������ �");
        }
        else
        {
            System.out.println("� ������ �");
            System.out.println("� ������ �");
        }

        if (a < b)
        {
            a = 0;
        }
        else
        {
        }

        if (a < b)
        {
            a = 0;
        }

        if (a < b)
            a = 0;

    }

}
