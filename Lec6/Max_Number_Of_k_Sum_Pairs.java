package Lec6;

public class Max_Number_Of_k_Sum_Pairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0  , r = nums.length -1 , op = 0;
        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum == k){
                op++;
                l++;
                r--;
            }else if(sum <k) {
                l++;
            }else{
                r--;
            }
        }
        return op;
    }
}
