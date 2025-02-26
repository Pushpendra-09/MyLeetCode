class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n=nums.length;
        int pair[]=new int[101];
        for(int i=0;i<n;i++)

        {
            int a=nums[i];
            count+=pair[a]++;
        }
          return count;

    }
  
}