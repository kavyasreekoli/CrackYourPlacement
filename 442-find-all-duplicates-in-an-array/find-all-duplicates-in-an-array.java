class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        
        for (int j = 0;j < nums.length; j++) {
            if (j != nums[j] - 1) {
                duplicates.add(nums[j]);
            }
        }
        
        return duplicates;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
        
    
}