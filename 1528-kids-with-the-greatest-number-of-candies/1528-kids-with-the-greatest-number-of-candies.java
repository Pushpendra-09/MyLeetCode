class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            if(maxcandy<candies[i]){
                maxcandy=candies[i];
            }
           


           // maxcandy=math.max(maxcandy, candy);
        }
        List<Boolean>result=new ArrayList<>();
        for(int candy:candies)
    {
        if(candy+extraCandies>=maxcandy)
        {
            result.add(true);
        }
        else{
            result.add(false);
        }
    }
    return result;
        
    }
}