package HW1;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int totalSides = 6;
        int a = 1 + (int) (Math.random() * totalSides);
        int b = 1 + (int) (Math.random() * totalSides);
        int sum = a + b;
        System.out.println(sum);
    }
}
