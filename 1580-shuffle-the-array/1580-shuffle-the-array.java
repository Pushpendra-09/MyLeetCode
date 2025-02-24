class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int ans[]= new int[l];
        int f=0;
        int index=0;
        int mid=n;
        while(mid<l)
        {
            ans[index++]=nums[f++];
            ans[index++]=nums[mid++];
            
        }
      
        return ans;
    }
}