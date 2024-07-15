class Solution:
    def findDuplicate(self, nums):
        slow = nums[0]
        fast = nums[0]

        # Phase 1: Find the intersection point of the two runners.
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break

        # Phase 2: Find the "entrance" to the cycle.
        fast = nums[0]
        while slow != fast:
            slow = nums[slow]
            fast = nums[fast]

        return slow

# Example usage:
solution = Solution()
nums = [1, 3, 4, 2, 2]
print(solution.findDuplicate(nums))  # Output: 2
