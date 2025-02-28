class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;  // This is for counting the number of digits of each number
        int sum = 0;    // This will store how many numbers have an even number of digits
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] /= 10;  // Remove the last digit of nums[i]
                ++count;         // Increment the digit count
            }
            if (count % 2 == 0) {  // Check if the number of digits is even
                sum++;             // If yes, increment the sum
            }
            count = 0;  // Reset count for the next number
        }
        
        return sum;  // Return the count of numbers with even digits
    }
}