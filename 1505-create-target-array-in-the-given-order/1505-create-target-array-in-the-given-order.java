class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        list.add(index[i],nums[i]);
        //System.out.println(list.get(i));
       }
      
       return list.stream().mapToInt(Integer::intValue).toArray();
    }
}