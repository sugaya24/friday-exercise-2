package week2.arrays;

public class BasicArrays2 {
    private final int LENGTH = 100;
    int length = LENGTH;

    public BasicArrays2(int length) {
        this.length = length;
    }

    public int randomNumber(int length) {
        return (int) (Math.random() * length);
    }

    public String toString(int i) {
        String result = String.format("Slot " + i + " contains a " + randomNumber(length));
        return result;
    }

    public static void main(String[] args) {
        BasicArrays2 a = new BasicArrays2(100);
        for (int i = 0; i < 10; i++) {
            System.out.println(a.toString(i));
        }
    }
}
