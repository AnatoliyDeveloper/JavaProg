package JavaStart.Lesson06.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 21.09.2016.
 */
public class SwitchTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number = ");
        int month = scanner.nextInt();
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Not understand month";
        }

        System.out.println(month + " month this is " + season + " .");

    }

}
