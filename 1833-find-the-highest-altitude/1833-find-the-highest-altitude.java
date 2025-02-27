class Solution {
    public int largestAltitude(int[] gain) {
        int maxalt=0;
        int currentalt=0;
        for(int i=0;i<gain.length;i++)
        {
            currentalt+=gain[i];
           // System.out.println(currentalt);
           maxalt=Math.max(maxalt,currentalt);
        }
        return maxalt;
    }
}