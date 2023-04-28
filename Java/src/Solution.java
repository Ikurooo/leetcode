import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null) return null;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int mirror = target - nums[i];

            if (map.containsKey(mirror)) {
                return new int[]{map.get(mirror), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] digits2 = new int[digits.length + 1];
        digits2[0] = 1;
        return digits2;
    }

    public int[] sortedSquares(int[] nums) {

        int[] squaredNums = new int[nums.length];
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        for (int i = squaredNums.length - 1; i >= 0 ; i--) {
            if (Math.abs(nums[leftPointer]) >= Math.abs(nums[rightPointer])) {
                squaredNums[i] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
            } else {
                squaredNums[i] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
            }
        }
        return squaredNums;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        if (k == 0) return false;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
                return true;
            hashMap.put(integer, i);
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> singles = new HashSet<>();

        for (int num: nums) {
            if (!singles.add(num)) {
                return true;
            }
        }
        return false;
    }
}
