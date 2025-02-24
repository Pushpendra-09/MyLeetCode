class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr_len=nums.length;
        for(int i=n;i<arr_len;i++)
        {
            nums[i]=(nums[i]*1024 +nums[i-n]);
        }
        int index=0;
        for(int i=n;i<arr_len;i++,index+=2)
        {
            nums[index]=nums[i]%1024;
            nums[index+1]=nums[i]/1024;
        }
      
        return nums;
    }
}