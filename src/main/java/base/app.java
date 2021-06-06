package base;

import java.util.Calendar;
import java.util.Scanner;

public class app {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet?");
        String input0 = in.nextLine();
        int num0 = Integer.parseInt(input0);

        System.out.print("What is the width of the room in feet?");
        String input1 = in.nextLine();
        int num1 = Integer.parseInt(input1);

        int area = num0 * num1;

        double areaconv = area * 0.09290304;

        System.out.print("You entered dimensions "+ input0 + " by " + input1 + " feet.");

        System.out.print("\nThe area is \n" + area + " square feet \n" + areaconv +
                " square meters");








    }
}
