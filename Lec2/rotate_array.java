package Lec2;

public class rotate_array {
    public void rev(int[] arr , int s , int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        rev(nums , 0 , n - k -1);
        rev(nums, n - k , n - 1);
        rev(nums , 0 , n-1);

    }
}
