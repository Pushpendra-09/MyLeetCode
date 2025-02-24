class Solution {
    public int maximumWealth(int[][] accounts) {
       int n=accounts.length;
       int s=0; 
       int f=0;
       int m = accounts[0].length;
       for(int i=0;i<n;i++)
       {
        s=0;
        for(int j=0;j<m;j++)
        {
            s+=accounts[i][j];
            if(s>f)
            {
                f=s;
            }
            
        }
        

       }
       return f;
        
    }
}