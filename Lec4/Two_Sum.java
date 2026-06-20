package Lec4;

import java.util.*;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int l = 0  , r = nums.length -1;
        //   int[] ans = new int[2];
        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum== target){
                // ans
                // ans[0] = l+1;
                // ans[1] = r+1;
                // return ans;
                return new int[]{l + 1 , r + 1};

            }else if(sum > target){
                r--;
            }else{
                //small
                l++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        int[] nums = {2 , 5 , 7 , 11, 15};
//        int target = 9;
//
//        int[] ans = twoSum(nums , target);
//
////        for(int i = 0;i < ans.length;i++){
////            System.out.println(ans[i]);
////        }
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);
       // ArrayList< ArrayList<Integer> > list = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(2);
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));

        }
    }
}
