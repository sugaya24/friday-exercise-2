package week2.arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
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
            System.out.println(input + " is in the ArrayList.");
        }
    }
}
