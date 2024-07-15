def combinationSum(nums, target):
    def backtrack(remain, combo, start):
        if remain == 0:
            result.append(list(combo))
            return
        elif remain < 0:
            return
        
        for i in range(start, len(nums)):
            combo.append(nums[i])
            backtrack(remain - nums[i], combo, i)
            combo.pop()
    
    result = []
    nums.sort()
    backtrack(target, [], 0)
    return result

nums = [2, 3, 6, 7]
target = int(input("Enter Target: "))
print(combinationSum(nums, target))
