import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()

        //arrays
        val testArray1 = intArrayOf(1, 2, 4, 23, 6, 17, 36, 0, 5)
        val answerArray1 = intArrayOf(2, 5)
        val target1 = 21

        val testArray2 = intArrayOf(1, 2, 4, 23, 6, 17, 36, 0, 5)
        val answerArray2: IntArray? = null
        val target2 = -1

        val testArray3 = intArrayOf(1, 2, 4, 23, 6, 17, 36, 0, 5)
        val answerArray3 = intArrayOf(1, 2)
        val target3 = 6

        val testArray4: IntArray? = null
        val answerArray4: IntArray? = null
        val target4 = 6

        val testArray5 = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768,
                65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216,
                33554432, 67108864, 134217728, 268435456, 536870912, 1073741824)
        val answerArray5 = intArrayOf(17, 28)
        val target5 = 268566528


        val testArray6 = intArrayOf(1, 2, 4)
        val answerArray6 = intArrayOf(1, 2, 5)

        val testArray7 = intArrayOf(9, 9, 9)
        val answerArray7 = intArrayOf(1, 0, 0, 0)

        val testArray8 = intArrayOf(1, 2, 9)
        val answerArray8 = intArrayOf(1, 3, 0)

        val testArray9 = intArrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9)
        val answerArray9 = intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        val testArray10 = intArrayOf(9, 9, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9)
        val answerArray10 = intArrayOf(9, 9, 9, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)


        val testArray11 = intArrayOf(-4, -1, 0, 3, 10)
        val answerArray11 = intArrayOf(0, 1, 9, 16, 100)

        val testArray12 = intArrayOf(0, 1, 2, 3, 4)
        val answerArray12 = intArrayOf(0, 1, 4, 9, 16)

        val testArray13 = intArrayOf(-5, -4, -3, -2, -1)
        val answerArray13 = intArrayOf(1, 4, 9, 16, 25)

        val testArray14 = intArrayOf(-100, -50, 0, 50, 100)
        val answerArray14 = intArrayOf(0, 2500, 2500, 10000, 10000)

        val testArray15 = intArrayOf(-4, -4, -4, -4, 0, 0, 0, 1, 1, 1, 4, 4, 4)
        val answerArray15 = intArrayOf(0, 0, 0, 1, 1, 1, 16, 16, 16, 16, 16, 16, 16)

        //tests
        testTwoSum(testArray1, target1, answerArray1, solution)
        testTwoSum(testArray2, target2, answerArray2, solution)
        testTwoSum(testArray3, target3, answerArray3, solution)
        testTwoSum(testArray4, target4, answerArray4, solution)
        testTwoSum(testArray5, target5, answerArray5, solution)

        testPlusOne(testArray6, answerArray6, solution)
        testPlusOne(testArray7, answerArray7, solution)
        testPlusOne(testArray8, answerArray8, solution)
        testPlusOne(testArray9, answerArray9, solution)
        testPlusOne(testArray10, answerArray10, solution)

        testSortedSquares(testArray11, answerArray11, solution)
        testSortedSquares(testArray12, answerArray12, solution)
        testSortedSquares(testArray13, answerArray13, solution)
        testSortedSquares(testArray14, answerArray14, solution)
        testSortedSquares(testArray15, answerArray15, solution)
    }

    fun testTwoSum(testArray: IntArray?, target: Int, answerArray: IntArray?, solution: Solution) {
        val received = solution.twoSum(testArray, target)
        if (Arrays.equals(received, answerArray)) {
            println("Test 1 successful")
        } else {
            println("Test failed, expected: " + Arrays.toString(answerArray) + ", received: " + Arrays.toString(received))
        }
    }

    fun testPlusOne(testArray: IntArray?, answerArray: IntArray?, solution: Solution) {
        val received = solution.plusOne(testArray!!)
        if (Arrays.equals(received, answerArray)) {
            println("Test 2 successful")
        } else {
            println("Test failed, expected: " + Arrays.toString(answerArray) + ", received: " + Arrays.toString(received))
        }
    }

    fun testSortedSquares(testArray: IntArray?, answerArray: IntArray?, solution: Solution) {
        val received = solution.sortedSquares(testArray!!)
        if (Arrays.equals(received, answerArray)) {
            println("Test 3 successful")
        } else {
            println("Test failed, expected: " + Arrays.toString(answerArray) + ", received: " + Arrays.toString(received))
        }
    }
}