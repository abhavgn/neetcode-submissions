class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int value : nums) {
            if (values.contains(value)) {
                return true;
            }
            values.add(value);
        }
        return false;
    }
}