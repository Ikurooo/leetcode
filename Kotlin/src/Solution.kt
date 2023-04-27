 class Solution {
    fun twoSum(nums: IntArray?, target: Int): IntArray? {

        if (nums == null) return null
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val mirror = target - nums[i]
            if (map.containsKey(mirror)) {
                return intArrayOf(map[mirror]!!, i)
            }
            map[nums[i]] = i
        }
        return null
    }

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val digits2 = IntArray(digits.size + 1)
        digits2[0] = 1
        return digits2
    }

    fun sortedSquares(nums: IntArray): IntArray {

        val squaredNums = IntArray(nums.size)
        var leftPointer = 0
        var rightPointer = nums.size - 1

        for (i in squaredNums.indices.reversed()) {
            if (Math.abs(nums[leftPointer]) >= Math.abs(nums[rightPointer])) {
                squaredNums[i] = nums[leftPointer] * nums[leftPointer]
                leftPointer++
            } else {
                squaredNums[i] = nums[rightPointer] * nums[rightPointer]
                rightPointer--
            }
        }
        return squaredNums
    }
}