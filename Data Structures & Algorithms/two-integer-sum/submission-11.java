class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

// i = 0, j = 1, 2, 3 ... n - 1
// i = 1, j = 2, 3 ... n -> (n - 2)
// 1 + 2 + 3 + ... + (n - 1)
// Sum: n ((n - 1) / 2)


