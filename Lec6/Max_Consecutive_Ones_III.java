package Lec6;

public class Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int ans = 0 , countZero = 0 , r = -1;

        for(int l =0; l < nums.length;l++){
            if(nums[l] == 0){
                countZero++;
            }

            while(countZero > k){
                // coun zero bring back within limit of k
                r++;
                if(nums[r] == 0){
                    countZero--;
                }
                // r++;
            }
            int len = l - r;
            if(len > ans)ans = len;
        }
        return ans;
    }
}
