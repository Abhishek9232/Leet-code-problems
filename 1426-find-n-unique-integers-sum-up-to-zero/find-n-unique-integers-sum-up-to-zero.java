class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        int temp=1;
        if(n%2!=0)
        { 
        for(int i=1;i<n-1;i++)
        {
            arr[i]= temp;
            arr[i+1]= -(temp);
            temp++;
            i++;
        }
        }
        else
        {
            for(int j =0;j<n;j++)
            {
                arr[j]=temp;
                arr[j+1] = -(temp);
                temp++;
                j++;
            }
        }
        return arr;

    }
}