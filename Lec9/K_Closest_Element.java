package Lec9;

public class K_Closest_Element {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0 , r = arr.length -1;
        int mid = 0;

        while(l <= r){
            mid = l + (r-l)/2;

            if(arr[mid] == x)break;
            else if(arr[mid] < x){
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }
        if(l > r)mid = l;
        List<Integer> ans = new ArrayList<>();
        int left = mid -1 , right = mid;
        while(left >= 0 && right < arr.length && k > 0){
            if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)){
                ans.add(arr[left]);
                left--;
            }else{
                ans.add(arr[right]);
                right++;
            }
            k--;
        }

        while(k > 0 && left >= 0){
            ans.add(arr[left]);
            left--;
            k--;
        }
        while(k > 0 && right < arr.length){
            ans.add(arr[right]);
            right++;
            k--;
        }
        Collections.sort(ans);
        return ans;

    }
}
