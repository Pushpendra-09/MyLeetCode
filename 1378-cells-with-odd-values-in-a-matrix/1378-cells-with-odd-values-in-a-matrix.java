class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        int count=0;
        for(int i=0;i<indices.length;i++)
        {
            int r=indices[i][0];
            int c=indices[i][1];
            for(int j=0;j<n;j++)
            {
                arr[r][j]++;
            }
            for(int j=0;j<m;j++)
            {
                arr[j][c]++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
        
    }
}