class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum=0;
        int maxsum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxsum=sum;
        for(int j=1;j<=k;j++){
            sum-=cardPoints[k-j];
            sum+=cardPoints[n-j];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;

    }
}