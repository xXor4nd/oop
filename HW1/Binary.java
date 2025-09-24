package HW1;

public class Binary {
    public static void main(String[] args) {

        // read in the command-line argument
        int n = Integer.parseInt(args[0]);

        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= n/2) {
            power *= 2;
        }

        // check for presence of powers of 2 in n, from largest to smallest
        while (power > 0) {

            // power is not present in n
            if (n < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                System.out.print(1);
                n -= power;
            }

            // next smallest power of 2
            power /= 2;
        }

        System.out.println();

    }

}


///******************************************************************************
// *  Compilation:  javac IntegerToBinaryString.java
// *  Execution:    java IntegerToBinaryString n
// *
// *  Prints out n in binary.
// *
// *  % java IntegerToBinaryString 5
// *  101
// *
// *  % java IntegerToBinaryString 106
// *  1101010
// *
// *  % java IntegerToBinaryString 0
// *  0
// *
// *  % java IntegerToBinaryString 16
// *  10000
// *
// *  Limitations
// *  -----------
// *  Does not handle negative integers or 0.
// *
// *  Remarks
// *  -------
// *  could use Integer.toBinaryString(n) instead.
// *
// ******************************************************************************/
//
//public class IntegerToBinaryString {
//    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//
//        // repeatedly divide by two, and form the remainders backwards
//        String s = "";
//        for (int i = n; i > 0; i /= 2) {
//            s = (i % 2) + s;
//        }
//        System.out.println(s);
//    }
//}