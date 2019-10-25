package week2.arrayLists;

import java.util.ArrayList;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        int max = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println( "ArrayList: " + nums);

        for (Integer n : nums) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("The largest value is " + max);
    }
}
