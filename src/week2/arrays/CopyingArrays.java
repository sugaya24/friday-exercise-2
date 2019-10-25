package week2.arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        // int[] arr2 = arr1;

        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        arr1[arr1.length - 1] = -7;
        System.out.print("arr1: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("arr2: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        
    }
}
