class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    
        int nL = num.length - 1;
        LinkedList<Integer> numList = new LinkedList<>();

        while (nL >=0 || k > 0) {
            if (nL >=0) k += num[nL--];
            numList.addFirst(k%10);
            k/=10;
        }
        return numList;
    }
}