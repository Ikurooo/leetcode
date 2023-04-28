import Solution
from typing import List
import numpy as np


def test_two_sum(nums: List[int], target: int, expected: int) -> List[int]:
    sol = Solution.Solution()
    result: List[int] = sol.twoSum(nums, target)
    if result == expected:
        print("Test 1 passed")
    else:
        print("Test 1 failed. Expected: {}, but got: {}".format(expected, result))

def test_plus_one(digits: List[int], expected: List[int]) -> List[int]:
    sol = Solution.Solution()
    result: List[int] = sol.plusOne(digits)
    if result == expected:
        print("Test 2 passed")
    else:
        print("Test 2 failed. Expected: {}, but got: {}".format(expected, result))

def test_sorted_squares(nums: List[int], expected: List[int]) -> List[int]:
    sol = Solution.Solution()
    result: List[int] = sol.sortedSquares(nums)
    if result == expected:
        print("Test 3 passed")
    else:
        print("Test 3 failed. Expected: {}, but got: {}".format(expected, result))

def test_contains_duplicate_1(nums: List[int], expected: bool) -> bool:
    sol = Solution.Solution()
    result: bool = sol.containsDuplicate1(nums)
    if result == expected:
        print("Test 4 passed")
    else:
        print("Test 4 failed. Expected: {}, but got: {}".format(expected, result))


test_array_1: List[int] = [1, 2, 4, 23, 6, 17, 36, 0, 5]
answer_array_1: List[int] = [2, 5]
target_1: int = 21

test_array_2: List[int] = [1, 2, 4, 23, 6, 17, 36, 0, 5]
answer_array_2: List[int] = None
target_2: int = -1

test_array_3: List[int] = [1, 2, 4, 23, 6, 17, 36, 0, 5]
answer_array_3: List[int] = [1, 2]
target_3: int = 6

test_array_4: List[int] = None
answer_array_4: List[int] = None
target_4: int = 6

test_array_5: List[int] = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768,
                            65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 
                            33554432, 67108864, 134217728, 268435456, 536870912, 1073741824]
answer_array_5: List[int] = [17, 28]
target_5: int = 268566528

test_array_6: List[int] = [1, 2, 4]
answer_array_6: List[int] = [1, 2, 5]

test_array_7: List[int] = [9, 9, 9]
answer_array_7: List[int] = [1, 0, 0, 0]

test_array_8: List[int] = [1, 2, 9]
answer_array_8: List[int] = [1, 3, 0]

test_array_9: List[int] = [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
answer_array_9: List[int] = [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

test_array_10: List[int] = [9, 9, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
answer_array_10: List[int] = [9, 9, 9, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


test_array_11: List[int] = [-4, -1, 0, 3, 10]
answer_array_11: List[int] = [0, 1 ,9 ,16 ,100]

test_array_12: List[int] = [0, 1, 2, 3, 4]
answer_array_12: List[int] = [0, 1, 4 , 9, 16]

test_array_13: List[int] = [-5, -4, -3 , -2, -1]
answer_array_13: List[int] = [1, 4, 9 ,16, 25]

test_array_14: List[int] = [-100, -50, 0, 50, 100]
answer_array_14: List[int] = [0, 2500, 2500, 10000, 10000]

test_array_15: List[int] = [-4, -4, -4, -4, 0, 0, 0, 1, 1, 1, 4, 4, 4]
answer_array_15: List[int] = [0, 0, 0, 1, 1, 1, 16, 16, 16, 16, 16, 16, 16]


test_array_16: List[int] = [1, 0, 0, 1, 1]
target_6: int = 1

test_array_17: List[int] = [1, 0, 0, 1, 1]
target_7: int = 4

test_array_18: List[int] = [1, 2, 3, 4, 5]
target_8: int = 4

test_array_19: List[int] = [1, 3, 0, 2, 1]
target_9: int = 1

test_array_20: List[int] = [1, 0, 0, 1, 1]
target_10: int = 0


test_array_21: List[int] = [1, 1, 1, 1, 1]
test_array_22: List[int] = [1, 2, 3, 4, 5]
test_array_23: List[int] = [1, 2, 3, 4, 1]
test_array_24: List[int] = [-1, 0, 1, 2, -1]
test_array_25: List[int] = [31, 42, 234, 53, 1]


test_two_sum(test_array_1, target_1, answer_array_1)
test_two_sum(test_array_2, target_2, answer_array_2)
test_two_sum(test_array_3, target_3, answer_array_3)
test_two_sum(test_array_4, target_4, answer_array_4)
test_two_sum(test_array_5, target_5, answer_array_5)

test_plus_one(test_array_6, answer_array_6)
test_plus_one(test_array_7, answer_array_7)
test_plus_one(test_array_8, answer_array_8)
test_plus_one(test_array_9, answer_array_9)
test_plus_one(test_array_10, answer_array_10)

test_sorted_squares(test_array_11, answer_array_11)
test_sorted_squares(test_array_12, answer_array_12)
test_sorted_squares(test_array_13, answer_array_13)
test_sorted_squares(test_array_14, answer_array_14)
test_sorted_squares(test_array_15, answer_array_15)

test_contains_duplicate_1(test_array_16, True)
test_contains_duplicate_1(test_array_17, True)
test_contains_duplicate_1(test_array_18, False)
test_contains_duplicate_1(test_array_19, True)
test_contains_duplicate_1(test_array_20, True)
