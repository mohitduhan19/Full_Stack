package Lec11;

public class Capacity_Ship_Packages {
    public boolean isPossible(int[] pages , int limit , int total_St){
        int st = 1 , currpage = 0;//71

        for(int i = 0;i < pages.length;i++){
            if(currpage + pages[i] <= limit){
                currpage += pages[i];
            }else{
                st++;
                currpage = pages[i];
            }
            // 0 + 25 -> 25 + 46 + 28
        }

        return st <= total_St;
    }
    public int max(int[] arr){
        int ans = 0;
        for(int i = 0;i < arr.length;i++){
            ans = Math.max(ans , arr[i]);
        }
        return ans;
    }
    public int sum(int[] arr){
        int ans = 0;
        for(int i = 0;i < arr.length;i++){
            ans += arr[i];
        }
        return ans;
    }
    public int shipWithinDays(int[] pages, int st) {
        int l = max(pages) , h = sum(pages);
        int ans = 0;

        while(l <= h){
            int mid = l + (h-l)/2;
            if(isPossible(pages , mid , st)){
                ans = mid;
                h = mid -1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }

}
