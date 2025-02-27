class Solution {
    public boolean checkIfPangram(String sentence) {
        int max=(1<<26)-1, temp=0;
        for(char ch:sentence.toCharArray())
        {
            temp |=1 <<ch-'a';
            if(temp==max) return true;
        }
        return false;
    }
      
}