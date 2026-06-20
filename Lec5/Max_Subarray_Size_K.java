package Lec5;

public class Max_Subarray_Size_K {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int res = 0;
        for(int i = 0;i < k;i++){
            res += arr[i];
        }

        int currsum = res;

        for(int i = k;i < n;i++){
            currsum = currsum + (arr[i] - arr[i-k]);
            res = Math.max(res , currsum);
        }
        return res;
    }
}
