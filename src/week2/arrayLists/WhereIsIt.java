package week2.arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int index = 0;

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println( "ArrayList: " + nums);

        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();

        if (nums.contains(input)) {
            index = nums.lastIndexOf(input);
            System.out.println(input + " is in slot " + index);
        } else {
            System.out.println(input + " is not in the ArrayList.");
        }
    }
}
