class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
       
        for (int i = 0; i < n; i++) {
  
        // Initialise start and end index
        int start = 0;
        int end = n - 1;
  
        // Till start < end, swap the element
        // at start and end index
        while (start < end) {
  
            // Swap the element
            int temp = image[i][start];
            image[i][start] = image[i][end];
            image[i][end] = temp;
  
            // Increment start and decrement
            // end for next pair of swapping
            start++;
            end--;
        }
        }

        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(image[i][j]==0){
                    
                    image[i][j]=1;
                }
            else{ 
                if(image[i][j]==1)
                {
                    image[i][j]=0;
                }
            }
            }
        }
        return image;
        
    }
}