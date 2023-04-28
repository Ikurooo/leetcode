import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //arrays
        int[] testArray1 = new int[] {1, 2, 4, 23, 6, 17, 36, 0, 5};
        int[] answerArray1 = new int[] {2, 5};
        int target1 = 21;

        int[] testArray2 = new int[] {1, 2, 4, 23, 6, 17, 36, 0, 5};
        int[] answerArray2 = null;
        int target2 = -1;

        int[] testArray3 = new int[] {1, 2, 4, 23, 6, 17, 36, 0, 5};
        int[] answerArray3 = new int[] {1, 2};
        int target3 = 6;

        int[] testArray4 = null;
        int[] answerArray4 = null;
        int target4 = 6;

        int[] testArray5 = new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768,
                                    65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216,
                                    33554432, 67108864, 134217728, 268435456, 536870912, 1073741824};
        int[] answerArray5 = new int[] {17, 28};
        int target5 = 268566528;


        int[] testArray6 = new int[] {1, 2, 4};
        int[] answerArray6 = new int[] {1, 2, 5};

        int[] testArray7 = new int[] {9, 9, 9};
        int[] answerArray7 = new int[] {1, 0, 0, 0};

        int[] testArray8 = new int[] {1, 2, 9};
        int[] answerArray8 = new int[] {1, 3, 0};

        int[] testArray9 = new int[] {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] answerArray9 = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] testArray10 = new int[] {9, 9, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] answerArray10 = new int[] {9, 9, 9, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        int[] testArray11 = new int[] {-4, -1, 0, 3, 10};
        int[] answerArray11 = new int[] {0, 1 ,9 ,16 ,100};

        int[] testArray12 = new int[] {0, 1, 2, 3, 4};
        int[] answerArray12 = new int[] {0, 1, 4 , 9, 16};

        int[] testArray13 = new int[] {-5, -4, -3 , -2, -1};
        int[] answerArray13 = new int[] {1, 4, 9 ,16, 25};

        int[] testArray14 = new int[] {-100, -50, 0, 50, 100};
        int[] answerArray14 = new int[] {0, 2500, 2500, 10000, 10000};

        int[] testArray15 = new int[] {-4, -4, -4, -4, 0, 0, 0, 1, 1, 1, 4, 4, 4};
        int[] answerArray15 = new int[] {0, 0, 0, 1, 1, 1, 16, 16, 16, 16, 16, 16, 16};


        int[] testArray16 = new int[] {1, 0, 0, 1, 1};
        int target6 = 1;

        int[] testArray17 = new int[] {1, 0, 0, 1, 1};
        int target7 = 4;

        int[] testArray18 = new int[] {1, 2, 3, 4, 5};
        int target8 = 4;

        int[] testArray19 = new int[] {1, 3, 0, 2, 1};
        int target9 = 1;

        int[] testArray20 = new int[] {1, 0, 0, 1, 1};
        int target10 = 0;


        int[] testArray21 = new int[] {1, 1, 1, 1, 1};
        int[] testArray22 = new int[] {1, 2, 3, 4, 5};
        int[] testArray23 = new int[] {1, 2, 3, 4, 1};
        int[] testArray24 = new int[] {-1, 0, 1, 2, -1};
        int[] testArray25 = new int[] {31, 42, 234, 53, 1};

        //tests
        testTwoSum(testArray1, target1, answerArray1, solution);
        testTwoSum(testArray2, target2, answerArray2, solution);
        testTwoSum(testArray3, target3, answerArray3, solution);
        testTwoSum(testArray4, target4, answerArray4, solution);
        testTwoSum(testArray5, target5, answerArray5, solution);


        testPlusOne(testArray6, answerArray6, solution);
        testPlusOne(testArray7, answerArray7, solution);
        testPlusOne(testArray8, answerArray8, solution);
        testPlusOne(testArray9, answerArray9, solution);
        testPlusOne(testArray10, answerArray10, solution);

        testSortedSquares(testArray11, answerArray11, solution);
        testSortedSquares(testArray12, answerArray12, solution);
        testSortedSquares(testArray13, answerArray13, solution);
        testSortedSquares(testArray14, answerArray14, solution);
        testSortedSquares(testArray15, answerArray15, solution);

        testContainsDuplicate2(testArray16, target6, true, solution);
        testContainsDuplicate2(testArray17, target7, true, solution);
        testContainsDuplicate2(testArray18, target8, false, solution);
        testContainsDuplicate2(testArray19, target9, false, solution);
        testContainsDuplicate2(testArray20, target10, false, solution);

        testContainsDuplicate(testArray21, true, solution);
        testContainsDuplicate(testArray22, false, solution);
        testContainsDuplicate(testArray23, true, solution);
        testContainsDuplicate(testArray24, true, solution);
        testContainsDuplicate(testArray25, false, solution);

    }

    public static void testTwoSum(int[] testArray, int target, int[] answerArray, Solution solution) {

        int[] received = solution.twoSum(testArray, target);
        if (Arrays.equals(received, answerArray)) {
            System.out.println("Test 1 successful");
        } else {
            System.out.println("Test failed, expected: " + Arrays.toString(answerArray) + ", received: " + Arrays.toString(received));
        }
    }

    public static void testPlusOne(int[] testArray, int[] answerArray, Solution solution) {

        int[] received = solution.plusOne(testArray);
        if (Arrays.equals(received, answerArray)) {
            System.out.println("Test 2 successful");
        } else {
            System.out.println("Test failed, expected: " + Arrays.toString(answerArray) + ", received: " + Arrays.toString(received));
        }
    }

    public static void testSortedSquares(int[] testArray, int[] answerArray, Solution solution) {

        int[] received = solution.sortedSquares(testArray);
        if (Arrays.equals(received, answerArray)) {
            System.out.println("Test 3 successful");
        } else {
            System.out.println("Test failed, expected: " + Arrays.toString(answerArray) + ", received: " + Arrays.toString(received));
        }
    }

    public static void testContainsDuplicate2(int[] testArray, int target, boolean answerBoolean, Solution solution) {

        boolean received = solution.containsNearbyDuplicate2(testArray, target);
        if (received == answerBoolean) {
            System.out.println("Test 4 successful");
        } else {
            System.out.println("Test failed, expected: " + answerBoolean + ", received: " + received);
        }
    }

    public static void testContainsDuplicate(int[] testArray, boolean answerBoolean, Solution solution) {

        boolean received = solution.containsDuplicate(testArray);
        if (received == answerBoolean) {
            System.out.println("Test 4 successful");
        } else {
            System.out.println("Test failed, expected: " + answerBoolean + ", received: " + received);
        }
    }
}