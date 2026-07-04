package Lec10;

public class Rows_With_Max_Ones {
    int lowerBound(int[]arr , int n , int x){
        int l = 0 , r = n -1;
        int ans = n;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] >= x){
                ans = mid;
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public int rowWithMax1s(int[][] arr) {
        // code here
        int cnt_max = 0;
        int idx = -1;

        for(int i = 0;i < arr.length;i++){
            int cnt_ones = arr[0].length - lowerBound(arr[i] , arr[0].length , 1);
            if(cnt_ones > cnt_max){
                cnt_max = cnt_ones;
                idx = i;
            }
        }
        return idx;

    }
}
