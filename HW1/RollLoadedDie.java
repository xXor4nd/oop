package HW1;

public class RollLoadedDie {
    /******************************************************************************
     *  Simulate the roll of a loaded six-sided die, where the values
     *  1, 2, 3, 4, and 5 appear with probability 1/8 and the value 6
     *  appears with probability 3/8, and print the resulting number.
     *
     ******************************************************************************/
    public static void main(String[] args) {
        double rd = Math.random() * 8; // [0, 8)
        int res;
        if (rd < 1.0) {
            res = 1;
        } else if (rd < 2.0) {
            res = 2;
        } else if (rd < 3.0) {
            res = 3;
        } else if (rd < 4.0) {
            res = 4;
        } else if (rd < 5.0) {
            res = 5;
        } else res = 6;
        System.out.println(res);
    }
}
