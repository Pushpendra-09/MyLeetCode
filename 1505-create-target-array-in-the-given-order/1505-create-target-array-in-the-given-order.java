class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // Initialize a target array with the same length as nums
        int[] target = new int[nums.length];
        
        // Fill the target array with a sentinel value (e.g., -1) to represent uninitialized values
        for (int i = 0; i < nums.length; i++) {
            target[i] = -1;  // You could also use another sentinel value based on the problem constraints
        }

        // Loop through each element in nums and insert it at the correct index in the target array
        for (int i = 0; i < nums.length; i++) {
            // Shift elements to the right if necessary to make space
            for (int j = nums.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            // Insert the current element at the correct index
            target[index[i]] = nums[i];
        }

        return target;
    }
}