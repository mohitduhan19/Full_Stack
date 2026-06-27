package Lec8;

public class First_Last_Occ {
    public int floor(int[] nums, int target){
        int left = 0 , right = nums.length - 1 , ans = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target)left = mid + 1;
            else right = mid - 1;
            //System.out.println(nums[mid]);
        }
        return ans;
    }

    public int ciel(int[]nums , int target){
        int left = 0 , right = nums.length - 1, ans = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }

            else if(nums[mid] > target)right = mid - 1;
            else left = mid + 1;
            //System.out.print(nums[mid]);
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int floorval = floor(nums , target);
        int cielval = ciel(nums , target);
        int ans[] = new int[2];
        ans[0] = floorval;
        ans[1] = cielval;
        return ans;
    }
}
