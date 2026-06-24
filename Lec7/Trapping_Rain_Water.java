package Lec7;

public class Trapping_Rain_Water {
    // public int[] getlm(int[] h, int n){
    //     int[] ans= new int[n];
    //     ans[0] = h[0];

    //     for(int i = 1;i < n;i++){
    //         ans[i] = Math.max(ans[i-1] , h[i]);
    //     }
    //     return lm;
    // }
    public int trap(int[] height) {
        int n = height.length;
        // int[] lm = getlm(height , n);
        // int[] rm = getrm(height , n);

        // int sum = 0;
        // for(int i= 0;i < n;i++){
        //     int h = Math.min(lm[i] , rm[i]) - height[i];
        //     sum += h;
        // }

        // return sum;


        int l = 0 , r = n -1 , ans = 0 , lm = 0 , rm = 0;

        while(l <= r){
            if(height[l] <= height[r]){
                if(height[l] >= lm)lm = height[l];
                else ans += lm - height[l];
                l++;
            }else{
                if(height[r] >= rm)rm = height[r];
                else ans += rm - height[r];
                r--;
            }
        }
        return ans;

    }
}
