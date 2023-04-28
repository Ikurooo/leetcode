from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        if nums == None:
            return None

        associations: dict = {}

        for index, num in enumerate(nums):
            mirror: int = target - num
            if mirror in associations:
                return [associations[mirror], index]
            associations[num] = index
        return None


    def plusOne(self, digits: List[int]) -> List[int]:

        length: int = len(digits) - 1

        for index, digit in enumerate(reversed(digits)):
            if digit < 9:
                digits[length - index] += 1
                return digits
            else:
                digits[length - index] = 0

        new_digits: List[int] = [0] * (length + 2)
        new_digits[0] = 1
        return new_digits
    

    def sortedSquares(self, nums: List[int]) -> List[int]:
        
        length: int = len(nums)
        left_pointer: int = 0
        right_pointer: int = length - 1
        squared_nums: List[int] = [0] * length

        while left_pointer <= right_pointer:
            if abs(nums[left_pointer]) >= abs(nums[right_pointer]):
                squared_nums[right_pointer - left_pointer] = nums[left_pointer] ** 2
                left_pointer += 1
            else:
                squared_nums[right_pointer - left_pointer] = nums[right_pointer] ** 2
                right_pointer -= 1
        return squared_nums
    
    def containsDuplicate(self, nums: List[int]) -> bool:

        singles: set = set()

        for num in nums:
            if num in singles:
                return True
            singles.add(num)
        return False
    
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:

        singles: dict = {}

        for index, num in enumerate(nums):
            if num in singles and index - singles.get(num) <= k:
                return True
            singles[num] = index
        return False
    