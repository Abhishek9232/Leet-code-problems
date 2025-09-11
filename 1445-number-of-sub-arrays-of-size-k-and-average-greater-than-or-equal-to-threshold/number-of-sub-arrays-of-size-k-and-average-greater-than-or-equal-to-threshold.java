class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
    
       
       // Code here
       int n= arr.length;
       int i =0,j=0;
       int count =0;
       double sum=0.0;
       while(j<n)
       {
           sum = sum +arr[j];
           if(j-i+1 == k)
           {
              if(threshold<=sum/k)
              {
                count++;
              }
               sum = sum-arr[i];
               
               i++;
           }
           j++;
       }
       return count;
    }
}