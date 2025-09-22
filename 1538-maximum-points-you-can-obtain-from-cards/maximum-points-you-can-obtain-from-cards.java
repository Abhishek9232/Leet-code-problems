class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        int n= cardPoints.length;
        for(int i=0;i<k;i++)
        {
            lsum=lsum+cardPoints[i];
            
        }
        maxsum = lsum;
        int rindx=n-1;
        for(int j=k-1;j>=0;j--)
        {
            lsum=lsum-cardPoints[j];
            rsum=rsum+cardPoints[rindx];
            rindx--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}