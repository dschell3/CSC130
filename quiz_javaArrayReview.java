public class Main {

    // returns the max int in a given non-empty array of ints
    public static int findMaximum( int[] n) {
        int max = n[0];
        for ( int i = 0; i < n.length; ++i) {
            if ( n[i] > max ) {
                max = n[i];
            }
        }
        return max;
    }

    // return the index of the max value
    public static int findMaximumIndex( int[] n) {
        int max = n[0];
        for ( int i = 0; i < n.length; ++i) {
            if ( n[i] > max ) {
                max = n[i];
            }
        }

        for ( int i = 0; i < n.length; ++i) {
            if ( n[i] == max ) {
                return i;
            }
        }
        return -1; // should never reach, indicate error
    }

    // Question 2
    public static int findTarget( int[] n, int target) {
        for (int i = 0; i < n.length; ++i) {
            if (n[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // question 3
    public static boolean tenStraightHeads(boolean[] tosses) {
        int count = 0;
        for (int i = 0; i < tosses.length; ++i) {
            if (tosses[i] == true) {
                ++count;
            }
            else {
                count = 0;
            }
            if (count == 10) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // test Question 3
        boolean[] test1 = {true, false, true, false, true, true, false, false};
        boolean[] test2 = {true, true, true, true, true};
        boolean[] test3 = {true, true, true, true, true, true, true, true, true, true};

        System.out.println(tenStraightHeads(test1)); // false
        System.out.println(tenStraightHeads(test2)); // false
        System.out.println(tenStraightHeads(test3)); // true

        // test Question 2
        int[] test4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] test5 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 8;

        System.out.println(findTarget(test4, target)); // 7
        System.out.println(findTarget(test5, target)); // -1

        // test Question 1
        int[] test6 = {81, 44, 12, -4, 41, 113, 69, 312, 11, -44};

        System.out.println(findMaximum(test5)); // 99
        System.out.println(findMaximum(test6)); // 312

        System.out.println(findMaximumIndex(test4)); // 8
        System.out.println(findMaximumIndex(test6)); // 7

    }
}
