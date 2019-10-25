package week2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] arr = new int[10];
        boolean flag = false;
        int index = 0;

        System.out.print("Array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                flag = true;
                index = i;
            }
        }

        if (flag) {
            System.out.println(input + " is in slot " + index);
        } else {
            System.out.println(input + " is not in the array.");
        }

    }
}
